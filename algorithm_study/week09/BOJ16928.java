import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ16928 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] gameBoard = new int[101];
    static int[] howManyDices = new int[101];
    static int ladder;
    static int snake;

    public static void main(String[] args) throws IOException {
        solution();
    }

    private static void solution() throws IOException {
        initGameBoard();
        initLadderSnake();
        applyLaddersAndSnakes();
        bfs();
        System.out.println(howManyDices[100]);
    }

    private static void applyLaddersAndSnakes() throws IOException {
        for (int i = 0; i < ladder + snake; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            gameBoard[from] = to;
        }
    }

    private static void initGameBoard() {
        for (int i = 1; i < gameBoard.length - 1; i++) {
            gameBoard[i] = i;
        }
    }

    private static void initLadderSnake() throws IOException {
        st = new StringTokenizer(br.readLine());
        ladder = Integer.parseInt(st.nextToken());
        snake = Integer.parseInt(st.nextToken());
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        howManyDices[1] = 0;
        while (!queue.isEmpty()) {
            int visitedNum = queue.poll();

            for (int i = 1; i <= 6; i++) {
                int destNum = visitedNum + i;

                if (isNumOutOfRange(destNum)) {
                    continue;
                }

                if (notVisitedNum(destNum)) {
                    queue.add(gameBoard[destNum]);
                    howManyDices[gameBoard[destNum]] = howManyDices[visitedNum] + 1;
                }

                if (arrived100(destNum)) {
                    break;
                }
            }
        }
    }

    private static boolean arrived100(int destNum) {
        return gameBoard[destNum] == 100;
    }

    private static boolean notVisitedNum(int destNum) {
        return howManyDices[gameBoard[destNum]] == 0;
    }

    private static boolean isNumOutOfRange(int destNum) {
        return destNum > 100;
    }
}
