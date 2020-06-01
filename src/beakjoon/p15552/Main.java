/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.15.
 * ���� 15552. ���� A+B
 */

package beakjoon.p15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());

		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < t; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(tokenizer.nextToken());
			int b = Integer.parseInt(tokenizer.nextToken());
			writer.write(a + b + "\n");
		}

		writer.flush();
		writer.close();
	}
}
