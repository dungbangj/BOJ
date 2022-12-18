class Test {
     long sum(int[] a) {
          int i = 0;
          long sum = 0;

          while (i < a.length) {
               sum += a[i++];
          }
          return (sum);
     }
}

public class BOJ15596 {
     public static void main(String[] args) {
          Test t = new Test();
     }
}
