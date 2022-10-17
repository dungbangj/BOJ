public class test {
     public static void main(String[] args) {
          Connection conn1 = Connection.getInstance();
          conn1.count();

          System.out.println("conn1.getCount() = " + conn1.getCount());
          System.out.println("conn1 = " + conn1);

          Connection conn2 = Connection.getInstance();
          conn2.count();

          System.out.println("=======================");
          System.out.println("conn1.getCount() = " + conn1.getCount());
          System.out.println("conn2.getCount() = " + conn2.getCount());
          System.out.println("conn1 = " + conn1);
          System.out.println("conn2 = " + conn2);
     }
}

class Connection {
     private static Connection inst = null;
     private int count = 0;

     static public Connection getInstance() {
          if (inst == null) {
               inst = new Connection();
               return inst;
          }
          return inst;
     }

     public void count() {
          count++;
     }

     public int getCount() {
          return count;
     }
}
