package kosa.oop;



public class BOOK {
	
	int javaPrice, jspPrice, orcalPrice;
	int result;
	boolean javaPass = false;
	boolean jspPass = false;
	boolean orcalPass = false;
	
	
	// 생성자
	public BOOK() {
		super();
	}
	
	public BOOK(int javaPrice, int jspPrice, int orcalPrice) {
		super();
		if (javaPrice >= 30000) {
			javaPrice = (int) ((int)javaPrice * 0.75);
			javaPass = true;
		}
		if (jspPrice >= 20000) {
			jspPrice = (int) ((int)jspPrice * 0.8);
			jspPass = true;
		}
		if (orcalPrice >= 15000) {
			orcalPrice = (int) ((int)orcalPrice * 0.85);
			orcalPass = true;
		}
		this.javaPrice = javaPrice;
		this.jspPrice = jspPrice;
		this.orcalPrice = orcalPrice;
	}

	public void result() {
		result = javaPrice+jspPrice+orcalPrice;
		if (javaPass==true) {
			System.out.printf("Java 교재는 정가는 30000원 할인된 가격은 %d원 입니다.\n",javaPrice);			
		}else {
			System.out.printf("Java 교재는 정가는 30000원 할인되지 않은 가격은 %d원 입니다.\n",javaPrice);
		}
		if (jspPass==true) {
			System.out.printf("JSP 교재는 정가는 20000원 할인된 가격은 %d원 입니다.\n",jspPrice);			
		}else {
			System.out.printf("JSP 교재는 정가는 30000원 할인되지 않은 가격은 %d원 입니다.\n",jspPrice);
		}
		if (orcalPass==true) {
			System.out.printf("Orcale 교재는 정가는 15000원 할인된 가격은 %d원 입니다.\n",orcalPrice);			
		}else {
			System.out.printf("Orcale 교재는 정가는 15000원 할인되지 가격은 %d원 입니다.\n",orcalPrice);
		}
		
		
		
//		System.out.printf("Java 교재는 정가는 30000원 할인된 가격은 %d원 입니다.\n"
//				+ "JSP 교재는 정가는 20000원 할인된 가격은 %d원 입니다. \n"
//				+ "Orcale 교재는 정가는 15000원 할인된 가격은 %d원 입니다.\n",javaPrice,jspPrice,orcalPrice);
		System.out.println("총금액: "+result);
	}
	
	
	
}
