/*
 * 작성자: 정은애
 * 작성일: 2019.09.27.
 * 백준 11720. 숫자의 합
 */

package beakjoon.p11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());
		String num = reader.readLine();

		int sum = 0;
		for (int i = 0; i < num.length(); i++)
			sum += num.charAt(i) - 48;

		System.out.println(sum);
	}

}
