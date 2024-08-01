import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class boj10172 {
	
	private static final Logger logger = Logger.getLogger(boj10172.class.getName());

	public static void main(String[] args) {
		printOutput();
	}

	private static void printOutput() {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write("|\\_/|\n");
			bw.write("|q p|   /}\n");
			bw.write("( 0 )\"\"\"\\\n");
			bw.write("|\"^\"`    |\n");
			bw.write("||_/=\\\\__|\n");
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to write output", e);
		}
	}
}
