/*
 * �ۼ���: ������
 * �ۼ���: 2019.10.24.
 * ���� 2581. �Ҽ�
 */

package beakjoon.p2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(reader.readLine()); // m�̻�
		int n = Integer.parseInt(reader.readLine()); // n����

		List<Integer> result = getPrimeNumbers(n);

		int sum = 0, min = n;
		for (int i : result) {
			if (i < m)
				continue;
			sum += i;
			if (i < min)
				min = i;
		}

		if (sum == 0)
			System.out.println("-1");

		else {
			System.out.println(sum);
			System.out.println(min);
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