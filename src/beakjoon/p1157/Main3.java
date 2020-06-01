/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.27.
 * ���� 1157. �ܾ� ����
 * �ð��� �� ���̷��� ó���� toUpperCase�� ���� �ʾƾ� �Ѵ�.
 */

package beakjoon.p1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String s = reader.readLine();

		int[] alpa = new int[26];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 'a')
				alpa[s.charAt(i) - 'A']++;
			else
				alpa[s.charAt(i) - 'a']++;
		}

		int maxValue = 0; // �ִ�
		int maxIndex = -1; // -1 �ִ��� ������

		for (int i = 0; i < alpa.length; i++) {

			if (maxValue == alpa[i]) { // �ִ��� ������
				maxIndex = -1;

			} else if (maxValue < alpa[i]) {
				maxValue = alpa[i];
				maxIndex = i;

			}
		}

		if (maxIndex == -1)
			System.out.println("?");
		else
			System.out.println((char) (maxIndex + 'A'));

	}
}
