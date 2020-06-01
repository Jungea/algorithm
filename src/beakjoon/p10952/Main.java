/*
 * 작성자: 정은애
 * 작성일: 2019.09.15.
 * 백준 10952. A+B - 5
 */

package beakjoon.p10952;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int a = Integer.parseInt(tokenizer.nextToken());
			int b = Integer.parseInt(tokenizer.nextToken());
			if (a == 0 && b == 0)
				break;
			writer.write(a + b + "\n");
		}

		writer.flush();
		writer.close();
	}

}
