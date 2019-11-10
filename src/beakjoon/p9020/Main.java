/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.20.
 * ���� 8958. OX����
 */

package beakjoon.p9020;

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
		int t = Integer.parseInt(reader.readLine());

		List<Integer> prime = getPrimeNumbers(10000);

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(reader.readLine());
			int nHalfIndex = Collections.binarySearch(prime, n / 2);
			if (nHalfIndex < 0) // ���� ��� list���� ���̰� �� ���� ���� ����
				nHalfIndex = (-nHalfIndex - 1) - 1;

			String partition = "";
			for (int j = nHalfIndex; j > -1; j--) {
				int p = n - prime.get(j);

				if (Collections.binarySearch(prime, p) >= 0) {
					partition = prime.get(j) + " " + p;
					break;
				}

			}

			if (partition.length() != 0)
				System.out.println(partition);

		}

	}

	static List<Integer> getPrimeNumbers(int n) {
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (int i = 2; (i * i) <= n; ++i) // ��Ʈ n���� ũ�� ���� ��
			if (prime[i]) {
				for (int j = i * 2; j <= n; j += i) // ���
					prime[j] = false;
			}
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 2; i <= n; ++i)
			if (prime[i])
				result.add(i);
		return result;
	}

}
