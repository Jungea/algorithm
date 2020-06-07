/*
 * 작성자: 정은애
 * 작성일: 2019.09.21.
 * 백준 4673. 셀프 넘버
 */

package beakjoon.p4673;

import java.util.HashSet;

public class Main {

	static HashSet<Integer> set;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10000;
		set = new HashSet<>();

		while (0 < num) {
			d(num);
			num--;
		}

		for (int i = 1; i < 10001; i++)
			if (set.contains(i) == false)
				System.out.println(i);
	}

	static void d(int num) {
		String numS = Integer.toString(num);
		int sum = 0;

		for (int i = 0; i < numS.length(); i++)
			sum += numS.charAt(i) - 48;

		sum += num;

		if (sum > 10000 || set.contains(sum))
			return;

		set.add(sum);
		d(sum);

	}

}
