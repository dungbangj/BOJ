import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class boj25083 {
	
	private static final Logger logger = Logger.getLogger(boj25083.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(drawSprout());
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to process input/output", e);
		}
	}

	private static String drawSprout() {
		StringBuilder sb = new StringBuilder();
		sb.append("         ,r'\"7\n" + //
				  "r`-_   ,'  ,/\n" + //
				  " \\. \". L_r'\n" + //
				  "   `~\\/\n" + //
				  "      |\n" + //
				  "      |\n");
		return sb.toString();
	}

	private static void printOutput(String data) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(data);
			bw.newLine();
		}
	}
}