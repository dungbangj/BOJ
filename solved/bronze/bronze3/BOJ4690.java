import java.io.*;
import java.util.*;
import java.lang.*;

public class BOJ4690 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		for (int i = 6; i < 101; i++) {
			threeable(i);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	private static void threeable(int a) {
		int powA = a * a * a;
		for (int i = 2; i < 101; i++) {
			for (int j = 2; j < 101; j++) {
				for (int k = 2; k < 101; k++) {
					int thr = three(i, j, k);
					if (thr > powA) {
						break;
					} else if (thr == powA && (k > j && j > i)) {
						sb.append("Cube = ").append(a).append(", Triple = (").append(i).append(",").append(j).append(",").append(k).append(")").append("\n");
					}
				}
			}
		}
	}

	private static int three(int b, int c, int d) {
		return b * b * b + c * c * c + d * d * d;
	}
}
