package yes;

import java.util.Scanner;

public class bj8958 {
	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < num; i++) {
			String OX = sc.nextLine();

			for(int j = 0 ; j < OX.length(); j++) {
				if(OX.charAt(j)=='O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			System.out.println(sum);
			sum = 0;
			cnt = 0;
		}
		sc.close();
		
	}

}
