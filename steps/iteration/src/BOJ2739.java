import java.util.Scanner;

public class BOJ2739 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int i = 0;

          int num = sc.nextInt();
          while (i++ < 9) {
               System.out.println(num + " * " + i + " = " + num * i);
          }
     }
}
