package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int num=sc.nextInt();
		String binary = Integer.toBinaryString(num);
		System.out.println(binary);


	}

}
