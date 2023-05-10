import java.io.*;
import java.util.*;
import java.lang.*;

public class BOJ10610 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String N = br.readLine();
        if (!N.contains("0")) {
            sb.append("-1");
        } else {
            String newN = N.replaceFirst("0", "");
            char[] arr = newN.toCharArray();
            Arrays.sort(arr);
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += Integer.parseInt(String.valueOf(arr[i]));
            }
            if (sum % 3 == 0) {
                char[] reversedArray = new char[arr.length + 1];
                for (int i = 0; i < reversedArray.length; i++) {
                    if (i == reversedArray.length - 1) {
                        reversedArray[i] = '0';
                    } else {
                        reversedArray[i] = arr[arr.length - 1 - i];
                    }
                }
                sb.append(reversedArray);
            } else {
                sb.append("-1");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
