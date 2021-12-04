package 자바테스트;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int num=sc.nextInt();
		String binary = Integer.toBinaryString(num);
		System.out.println(binary);


	}

}
