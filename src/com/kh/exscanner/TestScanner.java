package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// Scanner Ŭ������ �ִµ�
											// TestScanner���� ����Ұž�
		System.out.print("int ���� �Է��� �ּ��� : "); //println�� ���ٶ�� ���� print�� �ٷο��� ����
		int input1 = sc.nextInt();
		System.out.print("int �ι�° ���� �Է��� �ּ��� : ");
		int input2 = sc.nextInt();
		System.out.println("input1 : " + input1 );
		System.out.println("input2 : " + input2 );
		
		int result = input1 + input2;
		System.out.println("�ΰ��� ���� : " + result + "�Դϴ�.");
//		sc.close();
	
		
		
		System.out.print("�̸��� �Է��� �ּ��� : ");
		String strA = sc.next();
		System.out.println("���̸��� : " + strA);
		
	}
}
