/*
 * 작성자: 정은애
 * 작성일: 2019.09.15.
 * 백준 9498. 시험성적
 */

package beakjoon.p9498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(reader.readLine());

		if (i >= 90)
			System.out.println("A");
		else if (i >= 80)
			System.out.println("B");
		else if (i >= 70)
			System.out.println("C");
		else if (i >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}

}
