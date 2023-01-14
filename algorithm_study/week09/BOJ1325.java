import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ1325 {

    static final ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static Set<Integer> haveParents = new HashSet<>();
    static boolean[] visited;
    static int[] visitCount;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            haveParents.add(a);
        }
        visitCount = new int[N + 1];


        for (int i = 1; i <= N; i++) {
            if (haveParents.contains(i)) {
                visited = new boolean[N + 1];
                bfs(i);
            }
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, visitCount[i]);
        }
        for (int i = 1; i <= N; i++) {
            if(visitCount[i] == max) {
                bw.write(i + " ");
            }
        }

        bw.flush();
        bw.close();
    }

    private static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x] = true;

        while(!queue.isEmpty()) {
            int poppedNode = queue.poll();
            for(int node : graph.get(poppedNode)) {
                if(!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                    visitCount[node]++;
                }
            }
        }
    }
}
