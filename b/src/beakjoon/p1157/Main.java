/*
 * 작성자: 정은애
 * 작성일: 2019.09.27.
 * 백준 1157. 단어 공부
 */

package beakjoon.p1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String s = reader.readLine();
		s = s.toUpperCase(); // 대소문자 상관없는 문자열(대문자우선)

		int[] alpa = new int[26];

		int maxValue = 0; // 최댓값
		StringBuilder maxAlpa = new StringBuilder(); // 최댓값 알파벳

		for (int i = 0; i < s.length(); i++) {
			alpa[s.charAt(i) - 65]++;

			if (maxValue == alpa[s.charAt(i) - 65]) { // 최댓값이 같으면
				if (maxAlpa.toString().contains(Integer.toString(s.charAt(i))) == false) // 포함된 알파벳이 아닐 때만
					maxAlpa.append(String.format("%02d", (int) s.charAt(i)));

			} else if (maxValue < alpa[s.charAt(i) - 65]) {
				maxValue = alpa[s.charAt(i) - 65];
				maxAlpa.setLength(0); // 최댓값 인덱스들 비우기
				maxAlpa.append(String.format("%02d", (int) s.charAt(i)));

			}
		}

		if (maxAlpa.length() == 2)
			System.out.println((char) Integer.parseInt(maxAlpa.toString()));
		else
			System.out.println("?");

	}
}
