import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2851_백용민 {
     public static void main(String[] args) throws IOException {

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int[] arr = new int[10];
          for (int i = 0; i < arr.length; i++) {
               arr[i] = Integer.parseInt(br.readLine());
          }


          int sum = 0;
          int i = 0;
          int one = 0;
          int two = 0;

          while (true) {
               sum += arr[i++];
               if(sum > 100 || i == 10){
                    one = sum;
                    two = sum - arr[i - 1];
                    break;
               }
          }
          if (Math.abs(one - 100) > Math.abs(100 - two)) {
               System.out.println(two);
          } else {
               System.out.println(one);
          }


     }
}
