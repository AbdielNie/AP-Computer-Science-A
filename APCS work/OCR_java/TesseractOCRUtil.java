 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

/**
 * 
 * 
 * @author mjorcen
 * @email mjorcen@gmail.com
 * @dateTime Jun 19, 2014 3:42:16 PM
 * @version 1
 */
public class TesseractOCRUtil {
    static Logger logger = Logger.getLogger(TesseractOCRUtil.class);
    static String path = "E:/data/Users/Administrator/Desktop/ocr/spelling";
    
    public static void main(String[] args) throws Exception {
        
        File file = new File(path);
        String[] strs = file.list();
        for (String string : strs) {
            File iFile = new File(path, string);
            if (iFile.isFile()) {
                parseImage(new File(file.getAbsolutePath(), string), new File(
                        path + "/tmp", iFile.getName()));
            }
        }
        System.exit(0);

    }

    public static String parseImage(File file, File targetFile)
            throws Exception {

        ClearImageUtil.cleanImage(file, targetFile);
        return parseImageOnNoClear(targetFile);
    }

    public static String parseImageOnNoClear(File file) throws Exception {
        try {
            logger.debug("image is " + file.getAbsolutePath());

            // ClearImageHelper.cleanImage(file, filename);
            // 构�?�命�?
            // List<String> cmd = new LinkedList<String>();
            // cmd.add("tesseract");
            // cmd.add(file.getAbsolutePath());
            // cmd.add(file.getAbsolutePath());
            // cmd.add(" ");
            // cmd.add("-l");
            // cmd.add(" ");
            // cmd.add("normal");
            // logger.debug(cmd);
            // System.out.println(cmd);
            // ProcessBuilder pb = new ProcessBuilder(cmd);
            // pb.redirectErrorStream(true);
            // pb.directory(new File(path));
            // Process p = pb.start();
            Runtime run = Runtime.getRuntime();
            Process p = run.exec("cmd.exe /c tesseract "
                    + file.getAbsolutePath() + " " + file.getAbsolutePath()
                    + " -l normal");

            getConsole(p);
            String sb = getResult(new File(file.getAbsolutePath() + ".txt"));
            return sb.toString();
        } catch (Exception e) {
            logger.error(e);
            return null;
        } finally {
        }
    }

    private static String getResult(File file) throws FileNotFoundException,
            UnsupportedEncodingException, IOException {

        StringBuilder sb = new StringBuilder();
        // 取得结果的输出流
        InputStream resultIs = new FileInputStream(file);
        // 用一个读输出流类去读
        InputStreamReader resultIsr = new InputStreamReader(resultIs, "utf-8");
        // 用缓冲器读行
        BufferedReader resultBr = new BufferedReader(resultIsr);
        String line;
        // 直到读完为止
        while ((line = resultBr.readLine()) != null) {
            logger.debug(line);
            sb.append(line);
        }
        return sb.toString();
    }

    private static void getConsole(Process p)
            throws UnsupportedEncodingException, IOException {
        // 取得命令结果的输出流
        InputStream fis = p.getInputStream();
        // 用一个读输出流类去读
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");
        // 用缓冲器读行
        BufferedReader br = new BufferedReader(isr);
        String line = null;
        // 直到读完为止
        while ((line = br.readLine()) != null) {
            // System.out.println(line);
        }
    }

    public static void test() {
        try {
            List<String> cmd = new LinkedList<String>();
            cmd.add("javac");
            cmd.add("PB.java");
            ProcessBuilder pb = new ProcessBuilder(cmd);
            pb.redirectErrorStream(true);
            pb.directory(new File("E:/test"));
            Process p = pb.start();

            // 取得命令结果的输出流
            InputStream fis = p.getInputStream();
            // 用一个读输出流类去读
            InputStreamReader isr = new InputStreamReader(fis, "utf-8");
            // 用缓冲器读行
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            // 直到读完为止
            while ((line = br.readLine()) != null) {
                logger.debug(line);
            }
        } catch (Exception e) {
            logger.error(e);

        }
    }
}