import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class boj10171 {
	
	private static final Logger logger = Logger.getLogger(boj10171.class.getName());

	public static void main(String[] args) {
		printOutput();
	}

	private static void printOutput() {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write("\\    /\\\n");
			bw.write(" )  ( ')\n");
			bw.write("(  /  )\n");
			bw.write(" \\(__)|\n");
		} catch (IOException e) {
			logger.log(Level.WARNING, "Failed to write output", e);
		}
	}
}
