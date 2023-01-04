import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ11725 {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];
        int[] parentsOfNodes = new int[N + 1];

        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
            visited[i] = false;
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            graph.get(one).add(two);
            graph.get(two).add(one);
        }

        bfs(1, parentsOfNodes);

        for (int i = 2; i < N + 1; i++) {
            System.out.println(parentsOfNodes[i]);
        }

    }

    static void bfs(int curNode, int[] parentsOfNodes) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(curNode);
        visited[curNode] = true;
        while (queue.size() > 0) {
            int poppedNode = queue.poll();
            for (int node : graph.get(poppedNode)) {
                if (!visited[node]) {
                    parentsOfNodes[node] = poppedNode;
                    queue.add(node);
                    visited[node] = true;
                }
            }
        }
    }
}
