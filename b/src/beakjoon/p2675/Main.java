/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.27.
 * ���� 2675. ���ڿ� �ݺ�
 */

package beakjoon.p2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(reader.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

			int r = Integer.parseInt(tokenizer.nextToken());
			String s = tokenizer.nextToken();
			StringBuilder builder = new StringBuilder();

			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < r; k++)
					builder.append(s.charAt(j));
			}

			System.out.println(builder.toString());
		}

	}

}
