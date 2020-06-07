/*
 * 작성자: 정은애
 * 작성일: 2019.09.20.
 * 백준 10818. 최소, 최대
 */

package beakjoon.p10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		int[] a = new int[n];

		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(tokenizer.nextToken());

		Arrays.sort(a);

		System.out.println(a[0] + " " + a[n - 1]);
	}

}
