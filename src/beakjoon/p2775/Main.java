/*
 * �ۼ���: ������
 * �ۼ���: 2019.10.12.
 * ���� p2775. �γ�ȸ���� ���׾�
 */

package beakjoon.p2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine()); // �׽�Ʈ ����

		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(reader.readLine()); // ��
			int n = Integer.parseInt(reader.readLine()); // ȣ

			// 0�� �Է�x
			if (n == 1) // 1ȣ�� ��
				System.out.println(1);
			else if (k == 1) // 1���� ��
				System.out.println(n * (1 + n) / 2);

			else { // �׿�
				int[][] num = new int[k][n];

				for (int j = 0; j < n; j++) // 1�� �̸� ��� (���������� �� ����)
					num[0][j] = (j + 1) * (1 + (j + 1)) / 2;

				for (int j = 1; j < k; j++) { // 2������ k���� ���
					for (int l = 0; l < n; l++) { // 1ȣ���� nȣ���� ���
						if (l == 0) // 1ȣ�� ��
							num[j][0] = 1;
						else
							num[j][l] = num[j][l - 1] + num[j - 1][l];
					}
				}

				System.out.println(num[k - 1][n - 1]);
			}
		}

	}

}
