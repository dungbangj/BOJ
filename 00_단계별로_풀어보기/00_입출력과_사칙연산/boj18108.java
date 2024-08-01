import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj18108 {
	
	public static final Logger logger = Logger.getLogger(boj18108.class.getName());
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int y = Integer.parseInt(br.readLine());

			bw.write(getThaiYear(y) + "\n");
			
		} catch (IOException e) {
			logger.log(Level.WARNING, "Invalid input", e);
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				logger.log(Level.WARNING, "Failed to close Buffered class!", e);
			}
		}
	}

	private static int getThaiYear(int y) {
		return y - (2541 - 1998);
	}

}
