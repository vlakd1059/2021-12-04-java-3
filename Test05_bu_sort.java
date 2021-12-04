package 자바테스트;

import java.util.Scanner;

public class Test05_bu_sort {

	public static void main(String[] args) {

		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		// 입력부
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 원소 입력 >>");
			array[i] = sc.nextInt();
		}

		// 버블 정렬
		// 비교시 맨 처음 기준 원소는 항상 0번째 인덱스 이다
		// 기준 원소를 바꾸어감으로써 비교한다

		for (int i = 0; i < array.length - 1; i++) {// 회차
			for (int j = 0; j < array.length - i - 1; j++) {
				// 회차안의 인접한 숫자와 비교해서 현재 인덱스에있는값보다
				// 다음인덱스에 위치한 값이 크다면 바꾸어준다
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		} // 회차를 반복할 수 록 제일 큰값이 점차 위로 올라온다

		// 출력부
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
