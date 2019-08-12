package finalproject.ch.app.model;

import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.WinBase;
import com.sun.jna.platform.win32.WinBase.SECURITY_ATTRIBUTES;
import com.sun.jna.platform.win32.WinDef.DWORD;

public class Windows {

	public static void openBrowser() {
		System.out.println("============================= CASE 2");


        Kernel32 kernel32 = Kernel32.INSTANCE;
        SECURITY_ATTRIBUTES procSecAttr = new SECURITY_ATTRIBUTES();
        SECURITY_ATTRIBUTES threadSecAttr = new SECURITY_ATTRIBUTES();
        WinBase.PROCESS_INFORMATION.ByReference pi = new WinBase.PROCESS_INFORMATION.ByReference();
        WinBase.STARTUPINFO startupInfo = new WinBase.STARTUPINFO();
        boolean success = kernel32.CreateProcess(null,
                "explorer.exe http://news.163.com", procSecAttr, threadSecAttr,
                false, new DWORD(0x00000010), null, null, startupInfo, pi);


        if (!success) {
            System.out.println("�������ʧ��");
        } else {
            System.out.println("��������ɹ�");
        }

        kernel32.CloseHandle(pi.hProcess);
        kernel32.CloseHandle(pi.hThread);

        System.out.println();
	}
}
