import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
      int[][] a1=new int[4][4];
      int max=-50;
      for(int i=0;i<4;i++)
      {
        for(int j=0;j<4;j++)
        {int count=0;
          for(int k=i;k<i+3;k=k+2)
          {
            for(int l=j;l<j+3;l++)
            {
              //if(k!=i+1)
              {
              count+=arr[k][l];
            }
            }
          }
          a1[i][j]=count+arr[i+1][j+1];
          System.out.println(count+" "+a1[i][j]);//-arr[i+1][j]-arr[i+1][j+2];
          if(max<a1[i][j])
          {
          max=a1[i][j];
          }
        }
      }
      

return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
