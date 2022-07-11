package product.run;

import product.model.vo.Product;

public class TestProduct {
	public static void main(String[] args) { // main에서는 내가 만든 클래스를 불러왔음
		Product product = new Product();
		product.printProduct();
		// cntl+d : 해당줄 삭제
		// cntl+i ; 소스깔끔정리
		// cntl+space ; 어휘자동완성
		// cntl+/ : cntl+shift+c =전체주석
	}
}
