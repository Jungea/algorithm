/*
 * 작성자: 정은애
 * 작성일: 2019.12.24.
 * 백준  4153. 직각삼각형
 */

package beakjoon.p4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c, max;

		while (true) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			a = Integer.parseInt(tokenizer.nextToken());
			b = Integer.parseInt(tokenizer.nextToken());
			c = Integer.parseInt(tokenizer.nextToken());

			if (a == 0 && b == 0 && c == 0)
				break;

			max = Math.max(a, b);
			max = Math.max(max, c);

			boolean result;

			if (max == a)
				result = a * a == b * b + c * c;
			else if (max == b)
				result = b * b == a * a + c * c;
			else
				result = c * c == a * a + b * b;

			if (result)
				System.out.println("right");
			else
				System.out.println("wrong");

		}
	}

}
