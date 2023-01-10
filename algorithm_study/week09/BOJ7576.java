import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7576 {

    static final int[] MOVE_ROW = {1, -1, 0, 0};
    static final int[] MOVE_COL = {0, 0, 1, -1};
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Queue<Tomato> tomatoQueue = new LinkedList<>();
    static int[][] tomatoBox;
    static int row;
    static int col;

    public static void main(String[] args) throws IOException {
        initBox();
        fillBox();
        makeTomatoRotten();
        System.out.println(howLong());
    }

    private static void initBox() throws IOException {
        st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        tomatoBox = new int[row][col];
    }

    private static void fillBox() throws IOException {
        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                tomatoBox[i][j] = Integer.parseInt(st.nextToken());
                if (isRotten(i, j)) {
                    tomatoQueue.add(new Tomato(i, j));
                }
            }
        }
    }

    private static boolean isRotten(int i, int j) {
        return tomatoBox[i][j] == 1;
    }

    private static void makeTomatoRotten() {
        while (!tomatoQueue.isEmpty()) {
            Tomato tomato = tomatoQueue.poll();

            for (int i = 0; i < MOVE_ROW.length; i++) {
                int checkRow = tomato.row + MOVE_ROW[i];
                int checkCol = tomato.col + MOVE_COL[i];
                if (isInBoxRange(checkRow, checkCol) && stillNotRotten(checkRow, checkCol)) {
                    tomatoQueue.add(new Tomato(checkRow, checkCol));
                    makeTomatoRot(tomato, checkRow, checkCol);
                }
            }
        }
    }

    private static boolean isInBoxRange(int checkRow, int checkCol) {
        return checkCol >= 0 && checkRow >= 0 && checkCol < col && checkRow < row;
    }

    private static boolean stillNotRotten(int checkRow, int checkCol) {
        return tomatoBox[checkRow][checkCol] == 0;
    }

    private static void makeTomatoRot(Tomato tomato, int checkRow, int checkCol) {
        tomatoBox[checkRow][checkCol] = tomatoBox[tomato.row][tomato.col] + 1;
    }

    private static int howLong() {

        int maxDay = -2;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (stillNotRotten(i, j)) {
                    return -1;
                }
                maxDay = Math.max(maxDay, tomatoBox[i][j]);
            }
        }
        return maxDay - 1;
    }

    static class Tomato {
        int row;
        int col;

        public Tomato(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}
