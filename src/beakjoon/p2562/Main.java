/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.20.
 * ���� 2562. �ִ�
 */

package beakjoon.p2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int max = Integer.MIN_VALUE;
		int num = 0;
		for (int i = 1; i < 10; i++) {
			int a = Integer.parseInt(reader.readLine());
			if (a > max) {
				max = a;
				num = i;
			}
		}

		System.out.println(max);
		System.out.println(num);
	}
}
