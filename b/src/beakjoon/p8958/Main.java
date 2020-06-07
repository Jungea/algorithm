/*
 * 작성자: 정은애
 * 작성일: 2019.09.20.
 * 백준 8958. OX퀴즈
 */

package beakjoon.p8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner
		int n = Integer.parseInt(reader.readLine());
		String[] a = new String[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = reader.readLine();

			int sum = 0;
			int score = 1;

			for (int j = 0; j < a[i].length(); j++) {
				if (a[i].charAt(j) == 'O') {
					sum += score;
					score++;
				} else
					score = 1;
			}

			System.out.println(sum);
		}
	}

}
