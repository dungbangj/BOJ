import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class BOJ1167 {

	static final int START_NODE = 1;

	static List<Point>[] lists;
	static boolean visit[];
	static int max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int V = Integer.parseInt(br.readLine());
		lists = new List[V + 1];
		visit = new boolean[V + 1];

		for (int i = 0; i < V + 1; i++) {
			lists[i] = new ArrayList<>();
		}

		for (int i = 1; i < V + 1; i++) {
			int[] nodes = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int index = 0;
			int nodeNum = nodes[index++];

			while (true) {
				int linkedNodeNum = nodes[index++];
				if (linkedNodeNum == -1) {
					break;
				}
				int distance = nodes[index++];
				lists[nodeNum].add(new Point(linkedNodeNum, distance));
			}
		}

//		System.out.println(Arrays.toString(lists));
		visit[START_NODE] = true;
		dfs(START_NODE);
		bw.write(max + "\n");
		bw.flush();
		bw.close();
	}

	private static int dfs(int nodeNum) {
		int farthestDistance = 0;
		int secondFarthestDistance = 0;

		for (Point point : lists[nodeNum]) {
			int linkedNodeNum = point.x;
			int distanceToNode = point.y;

			if (visit[linkedNodeNum]) {
				continue;
			}
			visit[linkedNodeNum] = true;

			int movedDistance = dfs(linkedNodeNum) + distanceToNode;

			if (farthestDistance < movedDistance) {
				secondFarthestDistance = farthestDistance;
				farthestDistance = movedDistance;
			} else if (secondFarthestDistance < movedDistance) {
				secondFarthestDistance = movedDistance;
			}
		}
		max = Math.max(max, farthestDistance + secondFarthestDistance);
		return farthestDistance;
	}
}
