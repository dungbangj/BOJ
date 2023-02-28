package bronze;

class Class {


}

public class Problem4 {

  public static void main(String[] args) {

    Class str = new Class();
        System.out.println(System.identityHashCode(str));
    Class str1 = new Class();
    str = new Class();
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str1));




  }

}