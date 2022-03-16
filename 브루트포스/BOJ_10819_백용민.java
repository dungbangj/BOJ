package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10819_백용민 {
     static int n; //숫자 갯수
     static int[] arr; //입력받은 숫자를 넣을 배열
     static boolean[] visited; //방문한 숫자 체크
     static int[] tempArr; //만들어진 순열을 임시적으로 담는 저장소
     static int result; //결과값을 저장할 변수

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          n = Integer.parseInt(br.readLine());
          arr = new int[n];

          StringTokenizer stt = new StringTokenizer(br.readLine(), " ");

          int k = 0;
          while (stt.hasMoreTokens()) {
               arr[k++] = Integer.parseInt(stt.nextToken());
          }
          Arrays.sort(arr);
          System.out.println(Arrays.toString(arr));

          visited = new boolean[n];
          tempArr = new int[n];

          result = 0;
          solve(0);
          System.out.println(result);

     }

     public static void solve(int count) {

          if (count == n) {
               int sum = 0;
               for (int i = 0; i < n - 1; i++) {
                    sum += Math.abs(tempArr[i] - tempArr[i + 1]);
               }

               result = Math.max(result, sum);
               return;
          }

          for (int i = 0; i < n; i++) {
               if(visited[i]) continue;

               visited[i] = true;
               tempArr[count] = arr[i];
               solve(count+1);
               visited[i] = false;
          }
     }
}