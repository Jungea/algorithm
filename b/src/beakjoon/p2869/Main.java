/*
 * 작성자: 정은애
 * 작성일: 2019.10.18.
 * 백준 2869. 달팽이는 올라가고 싶다.
 */

package beakjoon.p2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner

		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int a = Integer.parseInt(tokenizer.nextToken());
		int b = Integer.parseInt(tokenizer.nextToken());
		int v = Integer.parseInt(tokenizer.nextToken());

		int result1 = a - b;
		double result2 = v - b;
		int result3 = (int) Math.ceil(result2 / result1);
		System.out.println(result3);

	}

}
