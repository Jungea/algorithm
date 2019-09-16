/*
 * 작성자: 정은애
 * 작성일: 2019.09.16.
 * 백준 1110. 더하기 사이클
 */

package beakjoon.p1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			String n = scan.nextLine();
			String k = new String(n);
			int count = 0;
			do {
				if (k.length() == 1)
					k = k + "" + k;
				else {
					int a = k.charAt(0) - 48;
					int b = k.charAt(1) - 48;
					String c = Integer.toString(a + b);
					if (c.length() == 1)
						k = b + "" + c;
					else
						k = b + "" + (c.charAt(1) - 48);
				}

				count++;
			} while (n.equals(k) == false);

			System.out.println(count);
		}
	}

}
