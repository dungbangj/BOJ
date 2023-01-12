import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1707 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] visited;
    static int flag;
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            flag = 0;
            st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            int line = Integer.parseInt(st.nextToken());
            graph = new ArrayList[node + 1];
            for (int j = 1; j < node + 1; j++) {
                graph[j] = new ArrayList<>();
            }
            for (int j = 0; j < line; j++) {
                st = new StringTokenizer(br.readLine());
                int one = Integer.parseInt(st.nextToken());
                int two = Integer.parseInt(st.nextToken());

                graph[one].add(two);
                graph[two].add(one);
            }
            visited = new int[node + 1];
            for (int k = 1; k < node + 1; k++) {
                if (visited[k] == 0) {
                    dfs(k, 1);
                }
            }
            if (flag == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    private static void dfs(int node, int color) {
        if (visited[node] != 0 || flag == 1) {
            return;
        }
        visited[node] = color;
        for (Integer oneNode : graph[node]) {
            if (visited[node] == visited[oneNode]) {
                flag = 1;
                return;
            }
            if (visited[oneNode] == 0)
                dfs(oneNode, color * (-1));
        }
    }
}
