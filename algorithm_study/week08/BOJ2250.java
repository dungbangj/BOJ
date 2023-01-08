import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2250 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Node>[] graph;
    static ArrayList<Node> widthStorage;
    static StringTokenizer st;
    static int rowCount;
    static int maxDepth;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        boolean[] hasParents = new boolean[N + 1];
        widthStorage = new ArrayList<>();
        graph = new ArrayList[N + 1];
        int[] diff = new int[N + 1];
        rowCount = 1;

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
            hasParents[i] = false;
            diff[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            if (left != -1)
                hasParents[left] = true;
            if (right != -1)
                hasParents[right] = true;
            graph[num].add(new Node(num, left, right));
        }

        int root = 0;
        for (int i = 1; i <= N; i++) {
            if (!hasParents[i]) {
                root = i;
            }
        }

        dfs(root, 1);

        for (int i = 1; i <= maxDepth; i++) {
            int start = 0;
            int end = 0;
            for (int j = 0; j < N; j++) {
                if (widthStorage.get(j).depth == i) {
                    start = j;
                    break;
                }
            }
            for (int j = N - 1; j >= 0; j--) {
                if (widthStorage.get(j).depth == i) {
                    end = j;
                    break;
                }
            }
            diff[i] = end - start + 1;
        }

        int maxIndex = 1;
        int maxDiff = 0;
        for (int i = 1; i <= maxDepth; i++) {
            if (maxDiff < diff[i]) {
                maxDiff = diff[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex + " " + maxDiff);
    }

    static void dfs(int node, int depth) {
        graph[node].get(0).setDepth(depth);
        if (graph[node].get(0).left != -1) {
            dfs(graph[node].get(0).left, depth + 1);
            graph[node].get(0).setLeft(-1);
        }
        if (graph[node].get(0).left == -1) {
            widthStorage.add(graph[node].get(0));
            graph[node].get(0).setIndex(rowCount++);
        }
        if (graph[node].get(0).right != -1) {
            dfs(graph[node].get(0).right, depth + 1);
            graph[node].get(0).setRight(-1);
        }
        if (depth > maxDepth) {
            maxDepth = depth;
        }
    }

    static class Node {
        int num;
        int left;
        int right;
        int depth;
        int index;

        public Node(int num, int left, int right) {
            this.num = num;
            this.left = left;
            this.right = right;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public void setRight(int right) {
            this.right = right;
        }

        public void setDepth(int depth) {
            this.depth = depth;
        }

        @Override
        public String toString() {
            return "num = " + num +
                ", depth = " + depth +
                ", index = " + index + "\n";
        }
    }
}
