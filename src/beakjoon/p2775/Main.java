/*
 * 작성자: 정은애
 * 작성일: 2019.10.12.
 * 백준 p2775. 부녀회장이 될테야
 */

package beakjoon.p2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine()); // 테스트 개수

		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(reader.readLine()); // 층
			int n = Integer.parseInt(reader.readLine()); // 호

			// 0층 입력x
			if (n == 1) // 1호일 때
				System.out.println(1);
			else if (k == 1) // 1층일 때
				System.out.println(n * (1 + n) / 2);

			else { // 그외
				int[][] num = new int[k][n];

				for (int j = 0; j < n; j++) // 1층 미리 계산 (등차수열의 합 공식)
					num[0][j] = (j + 1) * (1 + (j + 1)) / 2;

				for (int j = 1; j < k; j++) { // 2층부터 k까지 계산
					for (int l = 0; l < n; l++) { // 1호부터 n호까지 계산
						if (l == 0) // 1호일 때
							num[j][0] = 1;
						else
							num[j][l] = num[j][l - 1] + num[j - 1][l];
					}
				}

				System.out.println(num[k - 1][n - 1]);
			}
		}

	}

}
