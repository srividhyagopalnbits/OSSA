import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddODDSubtractEven {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for(int i=0;i<testcase;i++)
        {
          String s[] = br.readLine().split(" ");
          int a = Integer.parseInt(s[0]);
          int b = Integer.parseInt(s[1]);
          if(b ==a )
          {
              System.out.println(0);
          }
          else if(b >a)
          {
              if((b-a)%2 ==0)
              {
                  System.out.println(2);
              }
              else
              {
                  System.out.println(1);
              }
          }
          else if(a>b)
          {
              if( (a-b)%2 ==0 )
              {
                  System.out.println(1);
              }
              else
              {
                  System.out.println(2);
              }
          }
        }

    }
}
