/*
 * 작성자: 정은애
 * 작성일: 2019.10.12.
 * 백준 p6064. 카잉 달력
 */

package beakjoon.p6064;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int m = Integer.parseInt(tokenizer.nextToken());
			int n = Integer.parseInt(tokenizer.nextToken());
			int x = Integer.parseInt(tokenizer.nextToken());
			int y = Integer.parseInt(tokenizer.nextToken());

			if (n == y)
				y = 0;

			int max = lcm(m, n);
			boolean check = false;
			int j;
			for (j = x; j < max + 1; j += m) {
				if (j % n == y) {
					check = true;
					break;
				}
			}
			if (check)
				System.out.println(j);
			else
				System.out.println(-1);
		}
	}

	public static int gcb(int x, int y) { // 최대공약수
		if (y == 0)
			return x;
		return gcb(y, x % y);
	}

	public static int lcm(int x, int y) { // 최소공배수
		return x * y / gcb(x, y);
	}
}
