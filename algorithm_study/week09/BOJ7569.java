import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7569 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] MOVE_COL = {0, 0, 1, -1, 0, 0};
    static int[] MOVE_ROW = {1, -1, 0, 0, 0, 0};
    static int[] MOVE_HEIGHT = {0, 0, 0, 0, 1, -1};
    static Queue<Tomato> tomatoQueue = new LinkedList<>();
    static int[][][] towerOfBoxes;
    static int col;
    static int row;
    static int height;

    public static void main(String[] args) throws IOException {
        initBoxes();
        fillBoxes();
        
        if (tomatoQueue.isEmpty()) {
            System.out.println(-1);
            return;
        }
        
        rottenTomatoBFS();
        System.out.println(howLong());
    }

    private static void initBoxes() throws IOException {
        st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        height = Integer.parseInt(st.nextToken());

        towerOfBoxes = new int[height][row][col];
    }

    public static void fillBoxes() throws IOException {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < row; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < col; k++) {
                    towerOfBoxes[i][j][k] = Integer.parseInt(st.nextToken());
                    if (isTomatoRotten(i, j, k)) {
                        tomatoQueue.add(new Tomato(i, j, k));
                    }
                }
            }
        }
    }

    private static boolean isTomatoRotten(int i, int j, int k) {
        return towerOfBoxes[i][j][k] == 1;
    }

    public static void rottenTomatoBFS() {
        while (!tomatoQueue.isEmpty()) {
            Tomato tomato = tomatoQueue.poll();

            for (int i = 0; i < MOVE_COL.length; i++) {
                int checkRow = tomato.row + MOVE_ROW[i];
                int checkCOl = tomato.col + MOVE_COL[i];
                int checkHeight = tomato.height + MOVE_HEIGHT[i];

                if (isInBoxRange(checkRow, checkCOl, checkHeight) && stillNotRotten(checkRow, checkCOl, checkHeight)) {
                        tomatoQueue.add(new Tomato(checkHeight, checkRow, checkCOl));
                        makeTomatoRot(tomato, checkRow, checkCOl, checkHeight);
                }
            }
        }
    }

    private static boolean isInBoxRange(int checkRow, int checkCOl, int checkHeight) {
        return checkHeight >= 0 && checkCOl >= 0 && checkRow >= 0
            && checkHeight < height && checkCOl < col && checkRow < row;
    }

    private static boolean stillNotRotten(int checkRow, int checkCOl, int checkHeight) {
        return towerOfBoxes[checkHeight][checkRow][checkCOl] == 0;
    }

    private static void makeTomatoRot(Tomato tomato, int checkRow, int checkCOl, int checkHeight) {
        towerOfBoxes[checkHeight][checkRow][checkCOl] =
                towerOfBoxes[tomato.height][tomato.row][tomato.col] + 1;
    }

    public static int howLong() {
        int maxDay = -2;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    if (stillNotRotten(i, j, k)) {
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
