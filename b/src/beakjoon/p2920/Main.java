/*
 * 작성자: 정은애
 * 작성일: 2019.09.20.
 * 백준 2920. 음계
 */

package beakjoon.p2920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int check = 2; // ascending0, descending1, mixed2
		int a = Integer.parseInt(tokenizer.nextToken());
		if (a == 1) {
			check = 0;
			for (int i = 2; i < 9; i++) {
				int b = Integer.parseInt(tokenizer.nextToken());
				if (i != b) {
					check = 2;
					break;
				}
			}
		} else if (a == 8) {
			check = 1;
			for (int i = 7; i > 0; i--) {
				int b = Integer.parseInt(tokenizer.nextToken());
				if (i != b) {
					check = 2;
					break;
				}
			}
		}

		if (check == 0)
			System.out.println("ascending");
		else if (check == 1)
			System.out.println("descending");
		else
			System.out.println("mixed");
	}

}
