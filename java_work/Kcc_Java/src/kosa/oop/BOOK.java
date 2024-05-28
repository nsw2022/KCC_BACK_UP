package kosa.oop;



public class BOOK {
	
	int javaPrice, jspPrice, orcalPrice;
	int result;
	boolean javaPass = false;
	boolean jspPass = false;
	boolean orcalPass = false;
	
	
	// ������
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
			System.out.printf("Java ����� ������ 30000�� ���ε� ������ %d�� �Դϴ�.\n",javaPrice);			
		}else {
			System.out.printf("Java ����� ������ 30000�� ���ε��� ���� ������ %d�� �Դϴ�.\n",javaPrice);
		}
		if (jspPass==true) {
			System.out.printf("JSP ����� ������ 20000�� ���ε� ������ %d�� �Դϴ�.\n",jspPrice);			
		}else {
			System.out.printf("JSP ����� ������ 30000�� ���ε��� ���� ������ %d�� �Դϴ�.\n",jspPrice);
		}
		if (orcalPass==true) {
			System.out.printf("Orcale ����� ������ 15000�� ���ε� ������ %d�� �Դϴ�.\n",orcalPrice);			
		}else {
			System.out.printf("Orcale ����� ������ 15000�� ���ε��� ������ %d�� �Դϴ�.\n",orcalPrice);
		}
		
		
		
//		System.out.printf("Java ����� ������ 30000�� ���ε� ������ %d�� �Դϴ�.\n"
//				+ "JSP ����� ������ 20000�� ���ε� ������ %d�� �Դϴ�. \n"
//				+ "Orcale ����� ������ 15000�� ���ε� ������ %d�� �Դϴ�.\n",javaPrice,jspPrice,orcalPrice);
		System.out.println("�ѱݾ�: "+result);
	}
	
	
	
}
