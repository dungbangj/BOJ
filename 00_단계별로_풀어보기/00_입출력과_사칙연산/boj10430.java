import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj10430 {

    public static final Logger logger = Logger.getLogger(boj10430.class.getName());

    public static void main(String[] args) {
        printOutput(getFourOps(getInput()));
    }

    private static int[] getInput() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] ABC = Arrays.stream(br.readLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();
            if (ABC.length == 3) {
                return ABC;
            } else {
                throw new IOException("Invalid input length");
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, "Failed to read input", e);
        } catch (NumberFormatException e) {
            logger.log(Level.WARNING, "Invalid number format", e);
        }
        return new int[0];
    }

    private static void printOutput(int[] result) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            for (int value : result) {
                bw.write(value + "\n");
            }
            bw.flush();
        } catch (IOException e) {
            logger.log(Level.WARNING, "Failed to write output", e);
        }
    }

    private static int[] getFourOps(int[] ABC) {
        int A = ABC[0];
        int B = ABC[1];
        int C = ABC[2];

        return new int[]{
            (A + B) % C,
            ((A % C) + (B % C)) % C,
            (A * B) % C,
            ((A % C) * (B % C)) % C
        };
    }
}
