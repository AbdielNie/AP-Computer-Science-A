import java.util.Arrays;
public class perfect_riffle_faro_shuffle{
    //assumes input and output arrays are same length (N) 
    static public <T>void perfectShuffle(T[] input, T[] output, int N)
    {
        int top = 0;
        int bottom = N - (N/2);
        /* bottom has (N/2) elements; for odd N this is rounded down,
         * and the top part has 1 more element */
        int k = 0;
        while (bottom < N)
        {
            output[k++] = input[top++];
            output[k++] = input[bottom++];
        } 
        // handle last element for N = odd
        if (k < N)
            output[k] = input[top];
    }

    public static void main(String[] args) {
        int N = 52;
        String[] in = new String[N];
        String[] out = new String[N];
        for (int i = 0; i < N; ++i)
            in[i] = Integer.toString(i);
        perfectShuffle(in, out, N);
        System.out.println(Arrays.asList(out));
    }

}
