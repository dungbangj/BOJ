import java.util.Scanner;

public class BOJ25304 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int total = sc.nextInt();
          int num = sc.nextInt();
          int sum = 0;
          while (num > 0) {
               sum += sc.nextInt() * sc.nextInt();
               num--;
          }
          if (sum == total)
               System.out.println("Yes");
          else
               System.out.println("No");
     }
}
