package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String[] agrs) {
		// �Է¹��� �� �߿��� ������ �Է� �޾ҽ��ϴ�.
		// �Ǽ� ���� ���ڿ�
		
		Scanner sc= new Scanner(System.in);
		System.out.print("������ �Է��� �ּ��� : ");
		int iNum = sc.nextInt();
		
		System.out.print("�Ǽ��� �Է��� �ּ��� : ");
		double dNum = sc.nextDouble();
		
		System.out.print("���ڿ��� �Է��� �ּ��� : ");
		String inputStr = sc.next(); //next�� ���� �ȹް� nextline�� ���鵵 �޴´�
		
		System.out.print("���ڸ� �Է��� �ּ��� : ");
		char inputChar = sc.next().charAt(0); //nextchar�� ���� charAt�� �� �չ��� �߶� ������
		
		System.out.println("�Է��� ������ : " + iNum);
		System.out.println("�Է��� �Ǽ��� : " + dNum);
		System.out.println("�Է��� ���ڿ��� : " +  inputStr);
		System.out.println("�Է��� ���ڿ��� : " + inputChar);
		
		
		
		
	}
}
