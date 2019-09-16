/*
 * 작성자: 정은애
 * 작성일: 2019.09.16.
 * 백준 1110. 더하기 사이클
 * 한자리 수 입력 처리 수정 
 */

package beakjoon.p1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scan = new Scanner(System.in)) {
			int n = Integer.parseInt(scan.nextLine());

			int k = n;

			int count = 0;

			do {
				int a = k / 10; // 십의 자리
				int b = k % 10; // 일의 자리
				int c = (a + b) % 10;

				k = b * 10 + c;

				count++;
			} while (n != k);

			System.out.println(count);
		}
	}

}
