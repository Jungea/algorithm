/*
 * 작성자: 정은애
 * 작성일: 2019.09.20.
 * 백준 3052. 나머지
 * 채점 현황에서 아이디어 참고(다른 것보다 메모리 많이 듬.)
 */

package beakjoon.p3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner

		boolean[] remainder = new boolean[42];
		int count = 0;
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(reader.readLine());
			if (remainder[a % 42] == false) {
				remainder[a % 42] = true;
				count++;
			}
		}

		System.out.println(count);
	}

}
