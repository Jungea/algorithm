/*
 * �ۼ���: ������
 * �ۼ���: 2019.11.10.
 * ���� 1834. �������� ���� ���� ��
 */

package beakjoon.p1834;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner
		long n = Integer.parseInt(reader.readLine());

		long sum = 0;
		for (long i = 1; i < n; i++)
			sum += (n * i + i);

		System.out.println(sum);

	}

}
