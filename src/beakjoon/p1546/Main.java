/*
 * 작성자: 정은애
 * 작성일: 2019.09.21.
 * 백준 1546. 평균
 */

package beakjoon.p1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner

		int n = Integer.parseInt(reader.readLine());

		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		double[] score = new double[n];
		int m = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			score[i] = Integer.parseInt(tokenizer.nextToken());
			if (m < score[i])
				m = (int) score[i];
		}

		double sum = 0;
		for (int i = 0; i < n; i++) {
			score[i] = score[i] / m * 100;
			sum += score[i];
		}
		System.out.println(sum / score.length);

	}

}
