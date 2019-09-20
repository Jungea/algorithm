/*
 * 작성자: 정은애
 * 작성일: 2019.09.20.
 * 백준 10818. 최소, 최대
 * 입력 받으면서 최소, 최대 검사
 */

package beakjoon.p10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int min = Integer.parseInt(tokenizer.nextToken());
		int max = min;
		for (int i = 1; i < n; i++) {
			int a = Integer.parseInt(tokenizer.nextToken());
			if (a < min)
				min = a;
			else if (a > max)
				max = a;
		}

		System.out.println(min + " " + max);

	}

}
