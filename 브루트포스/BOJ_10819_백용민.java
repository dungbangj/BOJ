package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10819_백용민 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int num = Integer.parseInt(br.readLine());

          StringTokenizer stt = new StringTokenizer(br.readLine(), " ");
          int[] numArr = new int[num];

          int i = 0;
          while (stt.hasMoreTokens()) {
               numArr[i++] = Integer.parseInt(stt.nextToken());
          }
          Arrays.sort(numArr);
//          System.out.println(Arrays.toString(numArr));

          int left = 0;
          int right = num - 1;
          int[] newArr = new int[num];

          if (num % 2 == 0) {
               for (int j = 0; j < num; j++) {
                    if (j % 2 == 0) {
                         newArr[j] = numArr[left++];
                    } else {
                         newArr[j] = numArr[right--];
                    }
               }
          } else {
               for (int j = 0; j < num; j++) {
                    if (j == num - 1) {
                         newArr[j] = numArr[num / 2];
                    } else if (j % 2 == 0) {
                         newArr[j] = numArr[left++];
                    } else {
                         newArr[j] = numArr[right--];
                    }
               }
          }

//          System.out.println(Arrays.toString(newArr));

          formula(newArr);
     }

     public static void formula(int[] arr) {
          int[] absArr = new int[arr.length];
          int sum = 0;

          for (int i = 0; i < arr.length - 1; i++) {
               absArr[i] = Math.abs(arr[i] - arr[i + 1]);
          }

          for (int i : absArr) {
               sum += i;
          }

          System.out.println(sum);
     }
}
