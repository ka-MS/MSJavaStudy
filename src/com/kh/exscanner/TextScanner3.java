package com.kh.exscanner;

import java.util.Scanner;

public class TextScanner3 {
	public static void main(String[] args) {
//		이름을 입력해주세요.
//		민봉식
//		태어난 월을 입력해주세요.
//		9
//		키를 입력해주세요.
//		180
//		성별을 입력해주세요.
//		남
//		주소를 입력해주세요.
//		서울시 종로구
//		이름은 민봉식입니다.
//		태어난 월은 9입니다.
//		키는 180.0입니다.
//		성별은남입니다.
//		주소는 서울시 종로구입니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요. : " );
		String sName = sc.next();
		
		System.out.print("태어난 월을 입력해 주세요 : ");
		int iMonth = sc.nextInt();
		
		System.out.print("키를 입력해주세요 : ");
		double dTall = sc.nextDouble();
		
		System.out.print("성별을 입력해 주세요 : ");
		char cSex = sc.next().charAt(0);
		
		System.out.print("주소를 입력해 주세요 : ");
		sc.nextLine();
		// 성별에서 엔터치는것을 공백으로받아서 그걸 출력하기때문에 
		// 앞에 엔터를 받아줄 nextLine을 한번더 써준다
		String sAdr = sc.nextLine();
		// next와 nextline의 차이는 둘다 문자열 받음
		// nextLine은 공백을 입력 받음
		System.out.println();
		System.out.println("주소는 : " + sAdr);
		System.out.println("이름은 " + sName + "입니다.");
		System.out.println("태어난 월은 " + iMonth+ "월 입니다");
		System.out.println("키는" + dTall + "입니다.");
		System.out.println("성별은" + cSex+"입니다.");
		System.out.println("주소는 "+ sAdr+ "입니다.");
		
	}
}
