package 브루트포스;

import java.io.*;
import java.util.ArrayList;

public class BOJ_10974_백용민 {
     static boolean[] check = new boolean[8];
     static ArrayList<Integer> arr = new ArrayList<>();

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());

          String word = "";
          for (int i = 1; i <= num; i++) {
               word += i;
          }

          rec(word, "");

          for (Integer i : arr) {
               String newStr = i + "";
               for (int j = 0; j < num; j++) {
                    bw.write(newStr.charAt(j) + " ");
               }
               bw.write("\n");
          }
          bw.flush();
          bw.close();
     }

     public static void rec(String word, String temp) {
          if (temp.length() == word.length()) {
               if (!arr.contains(Integer.parseInt(temp))) {
                    arr.add(Integer.parseInt(temp));
               }
               return;
          }

          for (int i = 0; i < word.length(); i++) {
               if (check[i]) continue;

               temp += word.charAt(i);

               check[i] = true;
               rec(word, temp);
               check[i] = false;

               temp = temp.substring(0, temp.length() - 1);
          }
     }
}

