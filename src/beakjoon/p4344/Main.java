/*
 * 작성자: 정은애
 * 작성일: 2019.09.21.
 * 백준 4344. 평균은 넘겠지
 */

package beakjoon.p4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner
		int c = Integer.parseInt(reader.readLine());

		for (int i = 0; i < c; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

			int n = Integer.parseInt(tokenizer.nextToken());
			int[] a = new int[n];
			double total = 0;

			for (int j = 0; j < n; j++) {
				a[j] = Integer.parseInt(tokenizer.nextToken());
				total += a[j];
			}

			double average = total / a.length;
			double count = 0;

			for (int j = 0; j < n; j++)
				if (a[j] > average)
					count++;

			double result = (count / n) * 100;
			System.out.println(String.format("%.3f%%", result));
		}

	}

}
