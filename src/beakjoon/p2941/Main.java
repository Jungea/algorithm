/*
 * 작성자: 정은애
 * 작성일: 2019.09.27.
 * 백준 2941. 크로아티아 알파벳
 */
xxxxxxxxxxxxxxxxxxxxxx

package beakjoon.p2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();

		int count = 0;
		int i = s.length();
		while (i > 0) {
			i++;
			switch (s.charAt(i)) {

			case 'd':
				if (s.charAt(i + 1) == 'z') {

					if (s.charAt(i + 2) == '=') {
						count++;
						i += 2;

					} else
						count++;

				} else if (s.charAt(i + 1) == '-') {
					count++;
					i++;

				} else
					count++;

				break;

			case 'l':
			case 'n':
				if (s.charAt(i + 1) == 'j') {
					count++;
					i++;

				} else
					count++;

				break;

			case 's':
			case 'z':
				if (s.charAt(i + 1) == '=') {
					count++;
					i++;
				} else
					count++;

				break;

			case 'c':
				if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
					count++;
					i++;
				} else
					count++;

				break;

			default:
				count++;
				break;
			}
		}

		System.out.println(count);
	}

}
