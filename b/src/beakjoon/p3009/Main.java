/*
 * 작성자: 정은애
 * 작성일: 2019.11.17.
 * 백준 3009. 네 번쨰 점
 */

package beakjoon.p3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();

		for (int i = 0; i < 3; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int tempX = Integer.parseInt(tokenizer.nextToken());
			if (x.contains(tempX))
				x.remove(new Integer(tempX));
			else
				x.add(tempX);
			int tempY = Integer.parseInt(tokenizer.nextToken());
			if (y.contains(tempY))
				y.remove(new Integer(tempY));
			else
				y.add(tempY);
		}

		System.out.println(x.get(0) + " " + y.get(0));

	}

}
