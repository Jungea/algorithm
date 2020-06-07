/*
 * 작성자: 정은애
 * 작성일: 2019.09.27.
 * 백준 1157. 단어 공부
 * 최댓값들을 출력할 필요가 없으므로 StringBuilder를 사용할 필요가 없어짐.
 */

package beakjoon.p1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String s = reader.readLine();
		s = s.toUpperCase(); // 대소문자 상관없는 문자열(대문자우선)

		int[] alpa = new int[26];

		int maxValue = 0; // 최댓값
		int maxIndex = -1; // -1 최댓값이 여러개

		for (int i = 0; i < s.length(); i++) {
			alpa[s.charAt(i) - 65]++;

			if (maxValue == alpa[s.charAt(i) - 65]) { // 최댓값이 같으면
				maxIndex = -1;

			} else if (maxValue < alpa[s.charAt(i) - 65]) {
				maxValue = alpa[s.charAt(i) - 65];
				maxIndex = s.charAt(i);

			}
		}

		if (maxIndex == -1)
			System.out.println("?");
		else
			System.out.println((char) maxIndex);

	}
}
