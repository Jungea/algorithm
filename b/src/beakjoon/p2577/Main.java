/*
 * 작성자: 정은애
 * 작성일: 2019.09.21.
 * 백준 2577. 숫자의 개수
 */

package beakjoon.p2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner

		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		int c = Integer.parseInt(reader.readLine());

		String result = Integer.toString(a * b * c);

		int[] num = new int[10];
		for (int i = 0; i < result.length(); i++)
			num[result.charAt(i) - 48]++;

		for (int i = 0; i < num.length; i++)
			System.out.println(num[i]);
	}

}
