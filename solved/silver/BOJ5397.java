import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class BOJ5397 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String input = br.readLine();
			char[] inputChar = input.toCharArray();

			LinkedList<Character> linkedList = new LinkedList<>();
			ListIterator<Character> listIterator = linkedList.listIterator();

			for (char ch : inputChar) {
				switch (ch) {
					case '<':
						if (listIterator.hasPrevious()) {
							listIterator.previous();
						}
						break;
					case '>':
						if (listIterator.hasNext()) {
							listIterator.next();
						}
						break;
					case '-':
						if (listIterator.hasPrevious()) {
							listIterator.previous();
							listIterator.remove();
						}
						break;
					default:
						listIterator.add(ch);
				}
			}
			for (char ch : linkedList) {
				bw.write(Character.toChars(ch));
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
