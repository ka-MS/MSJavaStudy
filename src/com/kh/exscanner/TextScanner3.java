package com.kh.exscanner;

import java.util.Scanner;

public class TextScanner3 {
	public static void main(String[] args) {
//		�̸��� �Է����ּ���.
//		�κ���
//		�¾ ���� �Է����ּ���.
//		9
//		Ű�� �Է����ּ���.
//		180
//		������ �Է����ּ���.
//		��
//		�ּҸ� �Է����ּ���.
//		����� ���α�
//		�̸��� �κ����Դϴ�.
//		�¾ ���� 9�Դϴ�.
//		Ű�� 180.0�Դϴ�.
//		���������Դϴ�.
//		�ּҴ� ����� ���α��Դϴ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է����ּ���. : " );
		String sName = sc.next();
		
		System.out.print("�¾ ���� �Է��� �ּ��� : ");
		int iMonth = sc.nextInt();
		
		System.out.print("Ű�� �Է����ּ��� : ");
		double dTall = sc.nextDouble();
		
		System.out.print("������ �Է��� �ּ��� : ");
		char cSex = sc.next().charAt(0);
		
		System.out.print("�ּҸ� �Է��� �ּ��� : ");
		sc.nextLine();
		// �������� ����ġ�°��� �������ι޾Ƽ� �װ� ����ϱ⶧���� 
		// �տ� ���͸� �޾��� nextLine�� �ѹ��� ���ش�
		String sAdr = sc.nextLine();
		// next�� nextline�� ���̴� �Ѵ� ���ڿ� ����
		// nextLine�� ������ �Է� ����
		System.out.println();
		System.out.println("�ּҴ� : " + sAdr);
		System.out.println("�̸��� " + sName + "�Դϴ�.");
		System.out.println("�¾ ���� " + iMonth+ "�� �Դϴ�");
		System.out.println("Ű��" + dTall + "�Դϴ�.");
		System.out.println("������" + cSex+"�Դϴ�.");
		System.out.println("�ּҴ� "+ sAdr+ "�Դϴ�.");
		
	}
}
