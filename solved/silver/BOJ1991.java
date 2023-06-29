import java.io.*;
import java.util.*;

public class BOJ1991 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int N = Integer.parseInt(br.readLine());
		ArrayList<Node> nodes = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			Node node = new Node(65 + i);
			nodes.add(node);
		}

		for (int i = 0; i < N; i++) {
			String[] inputs = br.readLine().split(" ");
			int firstInput = inputs[0].toCharArray()[0];

			if (!inputs[1].equals(".")) {
				int inputLeft = inputs[1].toCharArray()[0];
				nodes.get(firstInput - 65).left = nodes.get(inputLeft - 65);
			}

			if (!inputs[2].equals(".")) {
				int inputRight = inputs[2].toCharArray()[0];
				nodes.get(firstInput - 65).right = nodes.get(inputRight - 65);
			}
		}

//		printAllNodes(N, nodes);
		preOrderTraversal(nodes.get(0));
		System.out.println();
		inOrderTraversal(nodes.get(0));
		System.out.println();
		postOrderTraversal(nodes.get(0));
	}

	private static void printAllNodes(int N, ArrayList<Node> nodes) {
		for (int i = 0; i < N; i++) {
			try {
				System.out.print((char) nodes.get(i).key);
			} catch (Exception ignored) {
			}
			try {
				System.out.print((char) nodes.get(i).left.key);
			} catch (Exception ignored) {
			}
			try {
				System.out.print((char) nodes.get(i).right.key);
			} catch (Exception ignored) {
			}
			System.out.println();
		}
	}

	private static void preOrderTraversal(Node node) {
		if (node == null) {
			return;
		}

		System.out.print((char) (node.key) + "");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

	private static void inOrderTraversal(Node node) {
		if (node == null) {
			return;
		}

		inOrderTraversal(node.left);
		System.out.print((char) (node.key) + "");
		inOrderTraversal(node.right);
	}

	private static void postOrderTraversal(Node node) {
		if (node == null) {
			return;
		}

		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print((char)(node.key) + "");
	}
}

class Node {
	int key;

	Node left, right;

	public Node(int key) {
		this.key = key;
		left = right = null;
	}
}