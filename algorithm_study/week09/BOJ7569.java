import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7569 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] MOVE_COL = {0, 0, 1, -1, 0, 0};
    static int[] MOVE_ROW = {1, -1, 0, 0, 0, 0};
    static int[] MOVE_HEIGHT = {0, 0, 0, 0, 1, -1};
    static Queue<Tomato> tomatoQueue;
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
        tomatoQueue = new LinkedList<>();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < row; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < col; k++) {
                    towerOfBoxes[i][j][k] = Integer.parseInt(st.nextToken());
                    if (towerOfBoxes[i][j][k] == 1) {
                        tomatoQueue.add(new Tomato(i, j, k));
                    }
                }
            }
        }
        if (tomatoQueue.isEmpty()) {
            System.out.println(-1);
            return;
        }
        rottenTomatoBFS();
        System.out.println(howLong());
    }

    public static void rottenTomatoBFS() {
        while (!tomatoQueue.isEmpty()) {
            Tomato tomato = tomatoQueue.poll();

            for (int i = 0; i < MOVE_COL.length; i++) {
                int checkRow = tomato.row + MOVE_ROW[i];
                int checkCOl = tomato.col + MOVE_COL[i];
                int checkHeight = tomato.height + MOVE_HEIGHT[i];

                if (checkHeight >= 0 && checkCOl >= 0 && checkRow >= 0
                    && checkHeight < height && checkCOl < col && checkRow < row) {

                    if (towerOfBoxes[checkHeight][checkRow][checkCOl] == 0) {
                        tomatoQueue.add(new Tomato(checkHeight, checkRow, checkCOl));
                        towerOfBoxes[checkHeight][checkRow][checkCOl] =
                                towerOfBoxes[tomato.height][tomato.row][tomato.col] + 1;
                    }
                }
            }
        }
    }

    public static int howLong() {
        int maxDay = -2;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    if (towerOfBoxes[i][j][k] == 0) {
                        return -1;
                    }
                    maxDay = Math.max(maxDay, towerOfBoxes[i][j][k]);
                }
            }
        }
        return maxDay - 1;
    }

    static class Tomato {

        int height;
        int row;
        int col;

        public Tomato(int height, int row, int col) {
            this.height = height;
            this.row = row;
            this.col = col;
        }
    }
}
