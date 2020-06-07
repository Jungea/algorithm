/*
 * 작성자: 정은애
 * 작성일: 2019.09.27.
 * 백준 1316. 그룹 단어 체커
 */

package beakjoon.p1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int count = 0; // 그룹 단어 개수

		for (int i = 0; i < n; i++) {
			String w = reader.readLine(); // 단어
			int[] alpa = new int[26];
			boolean check = true; // 그룹단어 여부

			if (w.length() == 1)
				count++;

			else {
				alpa[w.charAt(0) - 'a']++;
				for (int j = 1; j < w.length(); j++) {
					if (alpa[w.charAt(j) - 'a'] != 0 && w.charAt(j) != w.charAt(j - 1)) { // 연속된 알파벳이 아니다.
						check = false;
						break;
					} else
						alpa[w.charAt(j) - 'a']++;
				}

				if (check)
					count++;
			}
		}
		System.out.println(count);
	}

}
