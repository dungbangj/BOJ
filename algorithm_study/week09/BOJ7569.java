import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ7569 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][][] towerOfBoxes;
    static int col;
    static int row;
    static int height;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        height = Integer.parseInt(st.nextToken());

        towerOfBoxes = new int[height][row][col];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < row; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < col; k++) {
                    towerOfBoxes[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }

//        System.out.println(Arrays.deepToString(towerOfBoxes));



    }

    static void dfs(int i, int j, int k) {

    }

}
