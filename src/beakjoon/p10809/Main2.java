/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.27.
 * ���� 10809. ���ĺ� ã��
 */

package beakjoon.p10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();

		int[] alpa = new int[26];
		for (int i = 0; i < alpa.length; i++)
			alpa[i] = -1;

		for (int i = 0; i < s.length(); i++) {
			if (alpa[s.charAt(i) - 97] == -1)
				alpa[s.charAt(i) - 97] = i;
		}

		StringBuilder sb = new StringBuilder(Integer.toString(alpa[0]));

		for (int i = 1; i < alpa.length; i++)
			sb.append(" " + alpa[i]);

		System.out.println(sb.toString());
	}

}
