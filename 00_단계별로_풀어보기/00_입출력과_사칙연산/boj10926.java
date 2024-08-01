import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.logging.Level;

public class boj10926 {

	public static final Logger logger = Logger.getLogger(boj10926.class.getName());

	public static void main(String[] main) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String input = br.readLine();
			bw.write(input + "??!");
			bw.newLine();
		
		} catch (IOException e) {
			logger.log(Level.WARNING, "Invalid input", e);
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				logger.log(Level.WARNING, "Buffered class close failed!", e);
			}
		}
	}
}
