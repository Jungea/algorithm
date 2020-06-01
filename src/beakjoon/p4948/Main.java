/*
 * 작성자: 정은애
 * 작성일: 2019.11.03.
 * 백준 4948. 베르트랑 공준
 */

package beakjoon.p4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner

		while (true) {
			int n = Integer.parseInt(reader.readLine());

			if (n == 0)
				break;

			List<Integer> result = getPrimeNumbers(2 * n);
			int index = Collections.binarySearch(result, n);
			if (index < 0) {
				index = -index - 1;
				System.out.println(result.size() - index);
			} else
				System.out.println(result.size() - index - 1);

		}

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
