/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.15.
 * ���� 2753. ����
 */

package beakjoon.p2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner
		int year = Integer.parseInt(reader.readLine());

		if (year % 400 == 0)
			System.out.println("1");
		else if (year % 4 == 0) {
			if (year % 100 != 0)
				System.out.println("1");
			else
				System.out.println("0");
		} else
			System.out.println("0");
	}

}
