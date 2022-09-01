import java.util.Scanner;

public class BOJ2884 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int h = sc.nextInt();
          int m = sc.nextInt();
          if (h == 0 && m < 45) h = 23;
          else if (m < 45) h -= 1;
          if (m < 45) m = 60 - (45 - m);
          else m = m - 45;
          System.out.printf("%d %d\n", h, m);
     }
}
