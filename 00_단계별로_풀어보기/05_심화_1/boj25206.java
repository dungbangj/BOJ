import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class boj25206 {
	
	private static final Logger logger = Logger.getLogger(boj25206.class.getName());

	public static void main(String[] args) {
		try {
			printOutput(calAvg(getInputData()));
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Failed to process input/output", e);
		}
	}

	private static List<Score> getInputData() throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<Score> scores = new ArrayList<>();
			String line;

			while ((line = br.readLine()) != null && !line.strip().isEmpty()) {
				String[] input = line.split(" ");
				if (input[2].equals("P")) continue;
				Score score = new Score(Float.parseFloat(input[1]), input[2]);
				scores.add(score);
			}
			return scores;
		}
	}

	private static String calAvg(List<Score> scores) {
		Map<String, Float> grades = initGrades();

		float sum = 0;
		float bot_sum = 0;
		for (Score one : scores) {
			sum += one.getScore() * grades.get(one.getGrade());
			bot_sum += one.getScore();
		}
		return String.valueOf(sum / bot_sum);
	}

	private static Map<String, Float> initGrades() {
		Map<String, Float> grades = new HashMap<>();
		grades.put("A+", 4.5f);
		grades.put("A0", 4.0f);
		grades.put("B+", 3.5f);
		grades.put("B0", 3.0f);
		grades.put("C+", 2.5f);
		grades.put("C0", 2.0f);
		grades.put("D+", 1.5f);
		grades.put("D0", 1.0f);
		grades.put("F", 0.0f);
		return grades;
	}

	private static void printOutput(String data) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write(data);
			bw.newLine();
		}
	}
}

class Score {
	private final float score;
	private final String grade;

	public Score(float score, String grade) {
		this.score = score;
		this.grade = grade;
	}

	public float getScore() {
		return score;
	}

	public String getGrade() {
		return grade;
	}
}
