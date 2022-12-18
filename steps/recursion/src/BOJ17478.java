import java.io.*;

public class BOJ17478 {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
          int num = Integer.parseInt(br.readLine());
          bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
          int i = 0;

          while (i < num) {
               int j = 1;
               while (j <= i) {
                    bw.write("____");
                    j++;
               }
               bw.write("\"재귀함수가 뭔가요?\"\n");
               j = 1;
               while (j <= i) {
                    bw.write("____");
                    j++;
               }
               bw.write("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
               j = 1;
               while (j <= i) {
                    bw.write("____");
                    j++;
               }
               bw.write("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
               j = 1;
               while (j <= i) {
                    bw.write("____");
                    j++;
               }
               bw.write("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
               if (i == num - 1) {
                    j = 1;
                    int k = i + 1;
                    while (j <= k) {
                         bw.write("____");
                         j++;
                    }
                    bw.write("\"재귀함수가 뭔가요?\"\n");
                    j = 1;
                    while (j <= k) {
                         bw.write("____");
                         j++;
                    }
                    bw.write("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
                    while (k > 0) {
                         j = 1;
                         while (j <= k) {
                              bw.write("____");
                              j++;
                         }
                         bw.write("라고 답변하였지.\n");
                         k--;
                    }
                    bw.write("라고 답변하였지.\n");
               }
               i++;
          }
          br.close();
          bw.flush();
          bw.close();
     }
}
