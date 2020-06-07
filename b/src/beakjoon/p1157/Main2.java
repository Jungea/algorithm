/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.27.
 * ���� 1157. �ܾ� ����
 * �ִ񰪵��� ����� �ʿ䰡 �����Ƿ� StringBuilder�� ����� �ʿ䰡 ������.
 */

package beakjoon.p1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String s = reader.readLine();
		s = s.toUpperCase(); // ��ҹ��� ������� ���ڿ�(�빮�ڿ켱)

		int[] alpa = new int[26];

		int maxValue = 0; // �ִ�
		int maxIndex = -1; // -1 �ִ��� ������

		for (int i = 0; i < s.length(); i++) {
			alpa[s.charAt(i) - 65]++;

			if (maxValue == alpa[s.charAt(i) - 65]) { // �ִ��� ������
				maxIndex = -1;

			} else if (maxValue < alpa[s.charAt(i) - 65]) {
				maxValue = alpa[s.charAt(i) - 65];
				maxIndex = s.charAt(i);

			}
		}

		if (maxIndex == -1)
			System.out.println("?");
		else
			System.out.println((char) maxIndex);

	}
}
