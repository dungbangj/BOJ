package week;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BOJ1043 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<ArrayList<Integer>> whoKnows = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		int[] inputNM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] inputTrueP = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int totalP = inputNM[0];
		for (int i = 0; i <= totalP; i++) {
			whoKnows.add(new ArrayList<>());
			whoKnows.get(i).add(i);
		}
//		System.out.println(whoKnows);

		Set<Integer> knowSet = new HashSet<>();

		if (inputTrueP[0] == 0) {
			bw.write(inputNM[1] + "\n");
			bw.flush();
			bw.close();
			return;
		} else {
			for (int i = 1; i <= inputTrueP[0]; i++) knowSet.add(inputTrueP[i]);
		}
//		System.out.println();
		ArrayList<ArrayList<Integer>> partyPeople = new ArrayList<>();
		for (int i = 0; i <= inputNM[1]; i++) {
			partyPeople.add(new ArrayList<>());
			if (i == 0) continue;

			int[] inputParty = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int howManyP = inputParty[0];

			for (int j = 1; j <= howManyP; j++) {
//				System.out.print(" howManyP = " + howManyP + " inputParty = " + inputParty[j]);
				partyPeople.get(i).add(inputParty[j]);
				for (int k = j + 1; k <= howManyP; k++) {
					union(inputParty[j], inputParty[k]);
				}
			}
//			System.out.println();
		}
		Object[] arr = knowSet.toArray();
		for (int i = 0; i < whoKnows.size(); i++) {
			int num = find(whoKnows.get(i).get(0));
			for (Object o : arr) {
				if (find((Integer) o) == num) {
					knowSet.add(i);
				}
			}
		}
//		System.out.println("partyPeople = " + partyPeople);
//		System.out.println("whoKnows = " + whoKnows);
//		System.out.println("knowSet = " + knowSet);

		int count = 0;
		for (int i = 1; i <= inputNM[1]; i++) {
			boolean flag = true;
			for (int person : partyPeople.get(i)) {
				if (knowSet.contains(person)) {
					flag = false;
//					System.out.println(person);
					break;
				}
			}

			if (flag) count++;
		}
//		System.out.println(count);
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}

	static int find(int index) {
		if (index == whoKnows.get(index).get(0)) return index;
		else {
			int parent = whoKnows.get(index).remove(0);
			whoKnows.get(index).add(find(parent));
		}
		return whoKnows.get(index).get(0);
	}

	static void union(int x, int y) {
		x = find(x);
		y = find(y);

		if (x == y) return;
		if (x < y) deleteAndAdd(y, x);
		else deleteAndAdd(x, y);
	}

	static void deleteAndAdd(int bigger, int smaller) {
		whoKnows.get(bigger).remove(0);
		whoKnows.get(bigger).add(smaller);
	}
}
