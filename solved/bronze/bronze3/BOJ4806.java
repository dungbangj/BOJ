import java.io.*;
import java.util.*;
import java.lang.*;

public class BOJ4806 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int count = 0;
		String input;

		while ((input = br.readLine()) != null) {
			count++;
		}

		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
