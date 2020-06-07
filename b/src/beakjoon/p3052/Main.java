/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.20.
 * ���� 3052. ������
 * 1���� �迭�� ����� ����Ǯ��
 */

package beakjoon.p3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner

		int[] remainder = new int[10];
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(reader.readLine());
			remainder[i] = a % 42;
		}

		Arrays.sort(remainder);
		int count = 1;
		for (int i = 1; i < 10; i++)
			if (remainder[i - 1] != remainder[i])
				count++;

		System.out.println(count);
	}

}
