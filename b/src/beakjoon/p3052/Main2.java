/*
 * �ۼ���: ������
 * �ۼ���: 2019.09.20.
 * ���� 3052. ������
 * �ߺ��� ������ ����Ȱ�� Ǯ�� (�ð��� �� �����ɸ�)
 */

package beakjoon.p3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Scanner

		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(reader.readLine());
			set.add(a % 42);
		}

		System.out.println(set.size());
	}

}
