/*
 * 작성자: 정은애
 * 작성일: 2019.12.24.
 * 백준  4153. 직각삼각형
 */

package beakjoon.p4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] A = new int[3];
		while (true) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			A[0] = Integer.parseInt(tokenizer.nextToken());
			A[1] = Integer.parseInt(tokenizer.nextToken());
			A[2] = Integer.parseInt(tokenizer.nextToken());
			Arrays.sort(A);
			if (A[2] == 0)
				break;
			System.out.println((A[0] * A[0] + A[1] * A[1] == A[2] * A[2]) ? "right" : "wrong");
		}
	}

}
