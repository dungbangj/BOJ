import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.LinkPermission;
import java.util.StringTokenizer;

public class BOJ5358 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static char[] name;

    public static void main(String[] args) throws Exception {
        solution();
    }

    private static void solution() throws Exception {

        String input;
        while ((input = br.readLine()) != null) {
            name = input.toCharArray();
            for (int i = 0; i < name.length; i++) {
                changeName(i, 'i', 'e');
                changeName(i, 'I', 'E');
            }
            sb.append(String.valueOf(name)).append("\n");
//            System.out.println(String.valueOf(name));
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void changeName(int i, char iOrO, char oOrI) {
        if (name[i] == iOrO) {
            name[i] = oOrI;
        } else if (name[i] == oOrI) {
            name[i] = iOrO;
        }
    }
}
