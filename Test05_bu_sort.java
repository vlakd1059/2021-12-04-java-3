package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test05_bu_sort {

	public static void main(String[] args) {

		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		// �Էº�
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է� >>");
			array[i] = sc.nextInt();
		}

		// ���� ����
		// �񱳽� �� ó�� ���� ���Ҵ� �׻� 0��° �ε��� �̴�
		// ���� ���Ҹ� �ٲپ���ν� ���Ѵ�

		for (int i = 0; i < array.length - 1; i++) {// ȸ��
			for (int j = 0; j < array.length - i - 1; j++) {
				// ȸ������ ������ ���ڿ� ���ؼ� ���� �ε������ִ°�����
				// �����ε����� ��ġ�� ���� ũ�ٸ� �ٲپ��ش�
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		} // ȸ���� �ݺ��� �� �� ���� ū���� ���� ���� �ö�´�

		// ��º�
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
