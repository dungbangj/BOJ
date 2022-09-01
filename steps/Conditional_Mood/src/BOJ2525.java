import java.util.Scanner;

public class BOJ2525 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int h = sc.nextInt();
          int m = sc.nextInt();
          int plus = sc.nextInt();
          int x = m + plus;
          if (plus + m < 60)
               m += plus;
          else {
               while (x >= 60) {
                    h++;
                    if (h >= 24)
                         h = 0;
                    x -= 60;
               }

          }

          System.out.println(h + " " + x);
     }
}
