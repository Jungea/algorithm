/*
 * �ۼ���: ������
 * �ۼ���: 2019.10.04.
 * ���� 1712. ���ͺб���
 */

package beakjoon.p1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner

		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int a = Integer.parseInt(tokenizer.nextToken());
		int b = Integer.parseInt(tokenizer.nextToken());
		int c = Integer.parseInt(tokenizer.nextToken());

		int r1 = c - b;
		if (r1 < 1) {
			System.out.println("-1");
		} else {
			System.out.println((int) Math.floor(a / r1) + 1);
		}
	}

}
