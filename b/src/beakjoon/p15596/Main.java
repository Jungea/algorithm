/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.21.
 * ���� 15596. ���� N���� ��
 */

package beakjoon.p15596;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner
		int n = Integer.parseInt(reader.readLine());

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(reader.readLine());
		}

		System.out.println(sum(a));
	}

	static long sum(int[] a) {
		long sumA = 0;

		for (int i = 0; i < a.length; i++)
			sumA += a[i];

		return sumA;
	}
}
