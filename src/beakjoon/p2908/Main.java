/*
 * 작성자: 정은애
 * 작성일: 2019.09.27.
 * 백준 2908. 상수
 */

package beakjoon.p2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		StringBuilder builder = new StringBuilder();
		builder.append(tokenizer.nextToken());
		builder.reverse();
		int a = Integer.parseInt(builder.toString());

		builder.setLength(0);
		builder.append(tokenizer.nextToken());
		builder.reverse();
		int b = Integer.parseInt(builder.toString());

		System.out.println(a > b ? a : b);

	}

}
