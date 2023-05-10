import java.io.*;
import java.util.*;

public class BOJ21591 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int	lapOne = Integer.parseInt(st.nextToken());
		int	lapTwo = Integer.parseInt(st.nextToken());
		int stickerOne = Integer.parseInt(st.nextToken());
		int	stickerTwo = Integer.parseInt(st.nextToken());
		int res = 0;

		if (lapOne - stickerOne >= 2 && lapTwo - stickerTwo >= 2) {
			res = 1;
		}
		System.out.println(res);
	}
}
