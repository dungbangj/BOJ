import java.io.*;
import java.util.*;

public class BOJ21633 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		float res = Math.min((float)num / 100 + 25, 2000);
		res = Math.max(100, res);
		System.out.println(String.format("%.2f", res)); 

	}
}