import java.util.Scanner;

public class BOJ10950 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();

          while (num > 0) {
               System.out.println(sc.nextInt() + sc.nextInt());
               num--;
          }

     }
}
