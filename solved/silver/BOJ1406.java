import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class BOJ1406 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String inputStr = br.readLine();
		LinkedList<Character> linkedList = new LinkedList<>();

		for (char ch : inputStr.toCharArray()) {
			linkedList.add(ch);
		}

		ListIterator<Character> listIterator = linkedList.listIterator(linkedList.size());

		int M = Integer.parseInt(br.readLine());

		for (int i = 0; i < M; i++) {
			String[] cmd = br.readLine().split(" ");
			char action = cmd[0].charAt(0);

			switch (action) {
				case 'L':
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					break;

				case 'D':
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					break;

				case 'B':
					if (listIterator.hasPrevious()) {
						listIterator.previous();
						listIterator.remove();
					}
					break;

				case 'P':
					char ch = cmd[1].charAt(0);
					listIterator.add(ch);
					break;
			}
		}

		for (char ch : linkedList) {
			bw.write(ch);
		}

		bw.newLine();
		bw.flush();
		bw.close();
	}
}
