/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.20.
 * ���� 2920. ����
 * 1���� 8���� �������̹Ƿ� +-1���̰� �ƴϸ� ��� mixed�̴�.
 */

package beakjoon.p2920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputString = br.readLine().split(" ");
		int[] numlist = new int[8];
		String output = "";
		for (int i = 0; i < inputString.length; i++) {
			numlist[i] = Integer.parseInt(inputString[i]);
		}

		for (int i = 0; i < numlist.length - 1; i++) {
			if ((numlist[i] - numlist[i + 1]) == -1) {
				output = "ascending";
			} else if ((numlist[i] - numlist[i + 1]) == 1) {
				output = "descending";
			} else {
				output = "mixed";
				break;
			}
		}
		System.out.println(output);
	}

}
