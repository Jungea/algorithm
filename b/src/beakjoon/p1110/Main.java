/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.16.
 * ���� 1110. ���ϱ� ����Ŭ
 * ���ڸ� �� �Է� ó�� ���� 
 */

package beakjoon.p1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			int n = Integer.parseInt(scan.nextLine());

			int k = n;

			int count = 0;

			do {
				int a = k / 10; // ���� �ڸ�
				int b = k % 10; // ���� �ڸ�
				int c = (a + b) % 10;

				k = b * 10 + c;

				count++;
			} while (n != k);

			System.out.println(count);
		}
	}

}
