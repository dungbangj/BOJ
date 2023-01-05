import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1240 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<Store>[] graph;
    static int[] distance;
    static int N, M;
    static int end;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        distance = new int[N + 1];
        graph = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph[x].add(new Store(y, cost));
            graph[y].add(new Store(x, cost));
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            dfs(start, -1,0);
        }
    }

    public static void dfs(int x, int preNode, int cost) {
        if (x == end) {
            System.out.println(cost);
            return;
        }
        for (Store store : graph[x]) {
            if (store.node == preNode) {
                continue;
            }
            dfs(store.node, x, cost + store.cost);
        }
    }

    static class Store {

        int node, cost;

        public Store(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }
}
