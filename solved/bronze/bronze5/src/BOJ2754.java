import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ2754 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        HashMap<String, String> grades = new HashMap<>();
        grades.put("A+", "4.3");
        grades.put("A0", "4.0");
        grades.put("A-", "3.7");
        grades.put("B+", "3.3");
        grades.put("B0", "3.0");
        grades.put("B-", "2.7");
        grades.put("C+", "2.3");
        grades.put("C0", "2.0");
        grades.put("C-", "1.7");
        grades.put("D+", "1.3");
        grades.put("D0", "1.0");
        grades.put("D-", "0.7");
        grades.put("F", "0.0");
        bw.write(grades.get(br.readLine()));
        bw.flush();
        bw.close();
    }

}
