/*
 * 작성자: 정은애
 * 작성일: 2019.09.27.
 * 백준 11654. 아스키 코드
 */

package beakjoon.p11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char a = reader.readLine().charAt(0);

		System.out.printf("%d", (int) a);
	}

}
