import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ15805 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Set<Integer>[] cities;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] roads = new int[N];

        int max = 0;
        for (int i = 0; i < N; i++) {
            roads[i] = Integer.parseInt(st.nextToken());
            if (max < roads[i]) {
                max = roads[i];
            }
        }
        cities = new HashSet[max + 1];

        for (int i = 0; i <= max; i++) {
            cities[i] = new HashSet<>();
        }

        visited = new boolean[max + 1];
        int[] parentsOfNodes = new int[max + 1];
        parentsOfNodes[roads[0]] = -1;
        for (int i = 0; i < N - 1; i++) {
            cities[roads[i]].add(roads[i + 1]);
            cities[roads[i + 1]].add(roads[i]);
        }
        bfs(roads[0], parentsOfNodes);

        System.out.println(max + 1);
        for (int parentsOfNode : parentsOfNodes) {
            System.out.print(parentsOfNode + " ");
        }
    }

    static void bfs(int node, int[] parentsOfNodes) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        while (queue.size() > 0) {
            int poppedNode = queue.poll();
            for (int oneNode : cities[poppedNode]) {
                if (!visited[oneNode]) {
                    parentsOfNodes[oneNode] = poppedNode;
                    queue.add(oneNode);
                    visited[oneNode] = true;
                }
            }
        }
    }
}
