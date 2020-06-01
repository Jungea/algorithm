/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.27.
 * ���� 1316. �׷� �ܾ� üĿ
 */

package beakjoon.p1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int count = 0; // �׷� �ܾ� ����

		for (int i = 0; i < n; i++) {
			String w = reader.readLine(); // �ܾ�
			int[] alpa = new int[26];
			boolean check = true; // �׷�ܾ� ����

			if (w.length() == 1)
				count++;

			else {
				alpa[w.charAt(0) - 'a']++;
				for (int j = 1; j < w.length(); j++) {
					if (alpa[w.charAt(j) - 'a'] != 0 && w.charAt(j) != w.charAt(j - 1)) { // ���ӵ� ���ĺ��� �ƴϴ�.
						check = false;
						break;
					} else
						alpa[w.charAt(j) - 'a']++;
				}

				if (check)
					count++;
			}
		}
		System.out.println(count);
	}

}
