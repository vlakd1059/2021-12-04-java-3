package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test04_sel_sort {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		// �Էº�
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է� >>");
			array[i] = sc.nextInt();
		}

		// ���� ����
		for (int i = 0; i < array.length; i++) {

			// ���� �ε����ȿ� �ִ� ���� minNum���� ����
			int minNum = array[i];

			// ���� �ε����� ���� ����
			int minNumIndex = i;
			for (int j = i + 1; j < array.length; j++) {

				// ���� �ε����ȿ� �ִ� ������ ���� ���� �߰��Ѵٸ�
				// minNum�� ���� ������ �ٲپ� �ְ�
				// �ٲ� �ε����� �����Ѵ�
				if (minNum > array[j]) {
					minNumIndex = j;
					minNum = array[j];
				}
			}

			// ���� ���� ���� ����Ű�� �ε����� minNumIndex �� ���� �Ǿ� �����Ƿ�
			// ���� ���� ���� ��ġ�� �ٲ۴�!(=�ε����� �ٲ۴�)
			// ġȯ == ���� �ٲٴ�
			int temp = array[i];
			array[i] = array[minNumIndex];
			array[minNumIndex] = temp;

		}

		// ��º�
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
