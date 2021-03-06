/*
 * 작성자: 정은애
 * 작성일: 2019.10.24.
 * 백준 1978. 소수 찾기
 */

package beakjoon.p1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		List<Integer> primeNumbers = getPrimeNumbers(1000);

		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int count = 0;
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(tokenizer.nextToken());
			if (primeNumbers.contains(a))
				count++;
		}

		System.out.println(count);

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
