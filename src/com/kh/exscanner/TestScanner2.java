package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String[] agrs) {
		// 입력받은 것 중에서 정수를 입력 받았습니다.
		// 실수 문자 문자열
		
		Scanner sc= new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		int iNum = sc.nextInt();
		
		System.out.print("실수를 입력해 주세요 : ");
		double dNum = sc.nextDouble();
		
		System.out.print("문자열을 입력해 주세요 : ");
		String inputStr = sc.next(); //next는 공백 안받고 nextline은 공백도 받는다
		
		System.out.print("문자를 입력해 주세요 : ");
		char inputChar = sc.next().charAt(0); //nextchar은 없고 charAt로 맨 앞문자 잘라서 보여줌
		
		System.out.println("입력한 정수는 : " + iNum);
		System.out.println("입력한 실수는 : " + dNum);
		System.out.println("입력한 문자열은 : " +  inputStr);
		System.out.println("입력한 문자열은 : " + inputChar);
		
		
		
		
	}
}
