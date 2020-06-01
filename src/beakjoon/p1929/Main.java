/*
 * 작성자: 정은애
 * 작성일: 2019.10.24.
 * 백준 1929. 소수 구하기
 */

package beakjoon.p1929;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int m = Integer.parseInt(tokenizer.nextToken()); // m이상
		int n = Integer.parseInt(tokenizer.nextToken()); // n이하

		List<Integer> result = getPrimeNumbers(n);
		int index = Collections.binarySearch(result, m);
		if (index < 0)
			index = -index - 1;

		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = index; i < result.size(); i++)
			writer.write(result.get(i) + "\n");

		writer.flush();
		writer.close();

	}

	static List<Integer> getPrimeNumbers(int n) {
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (int i = 2; (i * i) <= n; ++i) // 루트 n보다 크지 않은 수
			if (prime[i]) {
				for (int j = i * 2; j <= n; j += i) // 배수
					prime[j] = false;
			}
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 2; i <= n; ++i)
			if (prime[i])
				result.add(i);

		return result;
	}
}
