/*
 * 작성자: 정은애
 * 작성일: 2019.09.27.
 * 백준 5622. 다이얼
 */

package beakjoon.p5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();

		int time = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'A':
			case 'B':
			case 'C':
				time += 3;
				break;

			case 'D':
			case 'E':
			case 'F':
				time += 4;
				break;

			case 'G':
			case 'H':
			case 'I':
				time += 5;
				break;

			case 'J':
			case 'K':
			case 'L':
				time += 6;
				break;

			case 'M':
			case 'N':
			case 'O':
				time += 7;
				break;

			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				time += 8;
				break;

			case 'T':
			case 'U':
			case 'V':
				time += 9;
				break;

			default:
				time += 10;
				break;
			}
		}

		System.out.println(time);
	}

}
