/*
 * 작성자: 정은애
 * 작성일: 2019.09.15.
 * 백준 2884. 알람시계
 */

package beakjoon.p2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int h = Integer.parseInt(tokenizer.nextToken());
		int m = Integer.parseInt(tokenizer.nextToken());

		int a = m - 45;
		if (a < 0) {
			if (h == 0) // 0 30일 떄 처리
				h = 24;
			System.out.println(--h + " " + (60 + a));
		} else
			System.out.println(h + " " + a);
	}

}
