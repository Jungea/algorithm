/*
 * 작성자: 정은애
 * 작성일: 2019.10.04.
 * 백준 2839. 설탕배달
 */

package beakjoon.p2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner
		int n = Integer.parseInt(reader.readLine());

		TreeSet<Integer> set = new TreeSet<>();
		int maxFive = n / 5;

		while (maxFive > -1) {
			int three = (n - maxFive * 5) / 3;
			if ((n - maxFive * 5) - three * 3 == 0)
				set.add(maxFive + three);

			maxFive--;
		}

		if (set.size() == 0)
			System.out.println("-1");
		else
			System.out.println(set.first());

	}

}
