/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.15.
 * ���� 10817. �� ��
 */

package beakjoon.p10817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int a = Integer.parseInt(tokenizer.nextToken());
		int b = Integer.parseInt(tokenizer.nextToken());
		int c = Integer.parseInt(tokenizer.nextToken());

		if (a < b) {
			if (c < b)
				System.out.println(a < c ? c : a);
			else
				System.out.println(b);
		} else {
			if (c < a)
				System.out.println(b < c ? c : b);
			else
				System.out.println(a);
		}

	}

}
