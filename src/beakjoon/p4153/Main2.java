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

public class Main2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;

		while (true) {

			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			a = Integer.parseInt(tokenizer.nextToken());
			b = Integer.parseInt(tokenizer.nextToken());
			c = Integer.parseInt(tokenizer.nextToken());

			if (a == 0 && b == 0 && c == 0)
				break;

			if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
				System.out.println("right");
			else
				System.out.println("wrong");

		}
	}

}
