/*
 * 작성자: 정은애
 * 작성일: 2019.11.17.
 * 백준 1085.직사각형에서 탈출
 */

package beakjoon.p1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int x = Integer.parseInt(tokenizer.nextToken());
		int y = Integer.parseInt(tokenizer.nextToken());
		int w = Integer.parseInt(tokenizer.nextToken());
		int h = Integer.parseInt(tokenizer.nextToken());

		int min = Integer.MAX_VALUE;
		min = Math.min(min, h - y);
		min = Math.min(min, y - 0);
		min = Math.min(min, x - 0);
		min = Math.min(min, w - x);

		System.out.println(min);
	}

}
