/*
 * 작성자: 정은애
 * 작성일: 2019.09.27.
 * 백준 1157. 단어 공부
 * 시간을 더 줄이려면 처음에 toUpperCase를 하지 않아야 한다.
 */

package beakjoon.p1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String s = reader.readLine();

		int[] alpa = new int[26];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 'a')
				alpa[s.charAt(i) - 'A']++;
			else
				alpa[s.charAt(i) - 'a']++;
		}

		int maxValue = 0; // 최댓값
		int maxIndex = -1; // -1 최댓값이 여러개

		for (int i = 0; i < alpa.length; i++) {

			if (maxValue == alpa[i]) { // 최댓값이 같으면
				maxIndex = -1;

			} else if (maxValue < alpa[i]) {
				maxValue = alpa[i];
				maxIndex = i;

			}
		}

		if (maxIndex == -1)
			System.out.println("?");
		else
			System.out.println((char) (maxIndex + 'A'));

	}
}
