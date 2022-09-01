import java.util.Scanner;

public class BOJ2480 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();

          int max = 0;
          if ((a > b && a > c) || (a == b && a > c) || (a == c && a > b))
               max = a;
          else if (b > c || (b == c && b > a))
               max = b;
          else if (c > b)
               max = c;

          if (a == b && b == c)
               System.out.println(10000 + a * 1000);
          else if (a != b && b != c && c != a)
               System.out.println(max * 100);
          else if (a == b && a != c)
               System.out.println(1000 + a * 100);
          else if (a == c && a != b)
               System.out.println(1000 + a * 100);
          else if(b == c && b != a)
               System.out.println(1000 + b * 100);
     }
}
