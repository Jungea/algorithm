/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.20.
 * ���� 10818. �ּ�, �ִ�
 * �Է� �����鼭 �ּ�, �ִ� �˻�
 */

package beakjoon.p10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int min = Integer.parseInt(tokenizer.nextToken());
		int max = min;
		for (int i = 1; i < n; i++) {
			int a = Integer.parseInt(tokenizer.nextToken());
			if (a < min)
				min = a;
			else if (a > max)
				max = a;
		}

		System.out.println(min + " " + max);

	}

}
