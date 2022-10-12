package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1924 {
     static int[] calMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
     static String[] calDay = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = new StringTokenizer(br.readLine());
          int month = Integer.parseInt(st.nextToken());
          int date = Integer.parseInt(st.nextToken());
          int sum = 0;
          for (int i = 0; i < month - 1; i++) {
               sum += calMonth[i];
          }
          sum += date;
          if (sum % 7 == 0) {
               System.out.println("SUN");
          } else {
               System.out.println(calDay[sum % 7 - 1]);
          }
     }
}
