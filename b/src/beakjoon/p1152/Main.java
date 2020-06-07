/*
 * 작성자: 정은애
 * 작성일: 2019.09.27.
 * 백준 1152. 단어의 개수
 */

package beakjoon.p1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int count = 0;
		while (tokenizer.hasMoreTokens()) {
			tokenizer.nextToken();
			count++;
		}

		System.out.println(count);

	}

}
