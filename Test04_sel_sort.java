package 자바테스트;

import java.util.Scanner;

public class Test04_sel_sort {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		// 입력부
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 원소 입력 >>");
			array[i] = sc.nextInt();
		}

		// 정렬 시작
		for (int i = 0; i < array.length; i++) {

			// 현재 인덱스안에 있는 값을 minNum으로 지정
			int minNum = array[i];

			// 현재 인덱스의 값도 저장
			int minNumIndex = i;
			for (int j = i + 1; j < array.length; j++) {

				// 현재 인덱스안에 있는 값보다 작은 값을 발견한다면
				// minNum을 작은 값으로 바꾸어 주고
				// 바뀐 인덱스를 저장한다
				if (minNum > array[j]) {
					minNumIndex = j;
					minNum = array[j];
				}
			}

			// 제일 작은 값을 가르키는 인덱스는 minNumIndex 에 저장 되어 있으므로
			// 제일 작은 값과 위치를 바꾼다!(=인덱스를 바꾼다)
			// 치환 == 값을 바꾸다
			int temp = array[i];
			array[i] = array[minNumIndex];
			array[minNumIndex] = temp;

		}

		// 출력부
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
