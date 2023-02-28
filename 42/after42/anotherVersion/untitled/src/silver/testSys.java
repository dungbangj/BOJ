package silver;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class testSys {

     public static void main(String[] args) {
          AtomicInteger num = new AtomicInteger(10);
          System.out.println(num.get());
          System.out.println(num.getAndSet(20));
          System.out.println(num.get());
          num.set(200);
          System.out.println(num.get());
          System.out.println();
          System.out.println(num.addAndGet(10));
          System.out.println(num.getAndAdd(10));
          System.out.println(num.getAndIncrement());
          System.out.println(num.getAndIncrement());
          System.out.println(num.getAndIncrement());
          System.out.println(num.get());



     }

}