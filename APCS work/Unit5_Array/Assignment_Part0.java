import java.util.Arrays;

/**
 * name: AbdielNnie
 * date: 11/17/2017
 * description: 7 different way to shuffle
 */
public class Assignment_Part0
{
    /*
     * shuffles:
     * 1.perfect riffle/faro shuffle
     * 2.imperfect Riffle/Faro shuffle
     * 3.smoosh shuffle
     * 4.monge shuffle
     * 5.milk shuffle
     * 6.overhand shuffle
     * 7.Hindu shuffle
     */
    /*
    public static String perfect_riffle_faro_shuffle()
    {
    String pockercard;
    }
     */

    public static void perfect_riffle(int [] input, int [] output, int N)
    {
        int top = 0;
        int bottom = N / 2;

        int k = 0;
        while (bottom < N)
        {
            output[k++] = input[top ++];
            output[k++] = input[bottom ++]; 
        }
        if (k < N)
            output[k] = input[top];
    }
    /*
    public static void main(String[] args) 
    {
        int N = 52;
        String[] in = new String[N];
        String[] out = new String[N];
        for (int i = 0; i < N; ++i)
            in[i] = Integer.toString(i);
        perfect_riffle(in, out, N);
        System.out.println(Arrays.asList(out));
    }
    */
}

