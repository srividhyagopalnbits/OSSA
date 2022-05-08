import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];
        int[] lis = new int[s.length];
        for(int i =0;i<s.length;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
            lis[i] =1;
        }
        for(int i =1;i<arr.length;i++)
        {
            for(int j =0;j<i;j++)
            {
                if(arr[i] >arr[j] && lis[i] <lis[j]+1)
                {
                    lis[i] = lis[j]+1;
                }
            }
        }
        int max =0;
        for(int val:lis)
        {
            if(max < val)
            {
                max = val;
            }
        }
        System.out.println(max);
    }
}
