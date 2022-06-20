package 이진탐색;

import java.util.Arrays;

class Solution {
     public static void main(String[] args) {

          Solution sol = new Solution();
          String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
          String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};

          System.out.println(Arrays.toString(sol.solution(words, queries)));
     }

     public int[] solution(String[] words, String[] queries) {
          String temp;
          int count;
          int sum;
          int[] answer = new int[queries.length];

          for (int j = 0; j < queries.length; j++) {
               count = 0;
               sum = 0;
               temp = "";

               if (queries[j].charAt(queries[j].length() - 1) == '?') {
                    for (int i = 0; i < queries[j].length(); i++) {
                         if (queries[j].charAt(i) == '?') break;
                         temp += queries[j].charAt(i);
                         count++;
                    }


                    System.out.println(queries[j]);
                    for (int i = 0; i < words.length; i++) {

                         System.out.println("words["+ i + "] = " + words[i]);
                         if (words[i].substring(0, count).equals(temp) && words[i].length() == queries[j].length()) {
                              sum++;
                         }
                    }
                         System.out.println();

                    answer[j] = sum;

               } else {
                    for (int i = queries[j].length() - 1; i >= 0  ; i--) {
                         if (queries[j].charAt(i) == '?') break;
                         temp += queries[j].charAt(i);
                         count++;
                    }

                    for (int i = 0; i < words.length; i++) {

                         if (words[i].substring(words[i].length() - count).equals(temp) && words[i].length() == queries[j].length()) {
                              sum++;
                         }
                    }

                    answer[j] = sum;
               }
          }

          return answer;
     }
}
