/*
 * 작성자: 정은애
 * 작성일: 2019.09.13.
 * 2019.09.09.과정지도 코테 1번문제
 */

package codingTest.day0909;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner
		String s = reader.readLine();
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		String opt = tokenizer.nextToken();

		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		writer.write(s + "\n");

		writer.flush();
		writer.close();
	}

}
