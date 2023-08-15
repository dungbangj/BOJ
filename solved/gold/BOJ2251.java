import java.io.*;
import java.util.*;

public class BOJ2251 {

	public static class Water {
		int a;
		int b;
		int c;

		public Water(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}

	public static final int MAX = 201;
	public static int a, b, c;
	public static ArrayList<Integer> arrayList = new ArrayList<>();
	public static boolean[][][] visited = new boolean[MAX][MAX][MAX];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] inputABC = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		a = inputABC[0];
		b = inputABC[1];
		c = inputABC[2];

		Queue<Water> queue = new LinkedList<>();
		queue.add(new Water(0, 0, c));

		while (!queue.isEmpty()) {
			Water water = queue.poll();

			if (visited[water.a][water.b][water.c]) continue;
			else visited[water.a][water.b][water.c] = true;

			if (water.a == 0) arrayList.add(water.c);

			abCase(queue, water.a, water.b, water.c);
			bcCase(queue, water.a, water.b, water.c);
			caCase(queue, water.a, water.b, water.c);
		}

		TreeSet<Integer> ansTreeSet = new TreeSet<>(arrayList);

		for (Integer integer : ansTreeSet) bw.write(integer + " ");

		bw.flush();
		bw.close();
	}

	private static void abCase(Queue<Water> queue, int wa, int wb, int wc) {
		if (wa + wb > a) queue.add(new Water(a, wa + wb - a, wc));
		else queue.add(new Water(wa + wb, 0, wc));

		if (wa + wb > b) queue.add(new Water(wa + wb - b, b, wc));
		else queue.add(new Water(0, wa + wb, wc));
	}

	private static void bcCase(Queue<Water> queue, int wa, int wb, int wc) {
		if (wb + wc > b) queue.add(new Water(wa, b, wb + wc - b));
		else queue.add(new Water(wa, wb + wc, 0));

		if (wb + wc > c) queue.add(new Water(wa, wb + wc - c, c));
		else queue.add(new Water(wa, 0, wb + wc));
	}

	private static void caCase(Queue<Water> queue, int wa, int wb, int wc) {
		if (wc + wa > c) queue.add(new Water(wc + wa - c, wb, c));
		else queue.add(new Water(0, wb, wc + wa));

		if (wc + wa > a) queue.add(new Water(a, wb, wc + wa - a));
		else queue.add(new Water(wc + wa, wb, 0));
	}
}
