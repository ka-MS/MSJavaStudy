package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// Scanner 클래스가 있는데
											// TestScanner에서 사용할거야
		System.out.print("int 값을 입력해 주세요 : "); //println은 한줄띄고 시행 print는 바로옆에 실행
		int input1 = sc.nextInt();
		System.out.print("int 두번째 값을 입력해 주세요 : ");
		int input2 = sc.nextInt();
		System.out.println("input1 : " + input1 );
		System.out.println("input2 : " + input2 );
		
		int result = input1 + input2;
		System.out.println("두값의 합은 : " + result + "입니다.");
//		sc.close();
	
		
		
		System.out.print("이름을 입력해 주세요 : ");
		String strA = sc.next();
		System.out.println("내이름은 : " + strA);
		
	}
}
