package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		//1. �迭 ����, ���� �и�
		int arr[];//�迭����
		arr = new int[5];// �迭 ����(�޸� �Ҵ�)
		
		//2. �迭 ����, ���� �Բ�
		int arr2[] = new int[5];
		arr2[0]=10;
		arr2[1]=20;
				
		//3. �迭����, ����, �ʱ�ȭ�� �Բ�
		int arr3[]= {1,2,3,4,5};
		
		// �迭�� �ִ� ���� ��ü ��� for
		for(int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"]="+arr3[i]);
		}
		// ��� ����
		for (int i : arr3) {
			System.out.println(i+", ");
		}
		
		System.out.println();
		
		// �迭 ��� ��� �޴���
		//1. �迭�� ���� ������ Ÿ���� �����Ѵ�.
		//2. �迭�� ũ�⸦ ���� �� �迭�� ũ�⸦ ���̰ų� �ø��� ���� => ArryaIndexOfBoundsException �߻�
		//3. �迭 ���� ��� => 1, 2, 3	
		//4. ��� �ʱ�ȭ �� ������ => ���� �ε��� ����, for��, ������ �ʱ�ȭ
		//5. �迭�� �����͸� ��� ��� => for��, ���� for, ���� index����
		
		
		// ����>Ű����κ��� ���ڿ��� �Է¹޾� �迭�� �߰��� �� ��ü�� �������
		// "q" �Է��Ҷ����� �Է�
		/*
		String vocab[] = new String[5] ;
		Scanner sc = new Scanner(System.in);
		String userinput =""; ;
		for (int i=0;i<vocab.length;i++) {
			System.out.print(">�Է� : ");
			userinput=sc.nextLine();
			if (userinput.equals("q")) {
				System.out.println("��ü��");			
				break;
			}
			vocab[i]=userinput;
		}
	
		for (String str : vocab) {
			System.out.println(str);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		String sArr[] = new String[10];
		int count = 0;
		
		while(true) {
			System.out.print(">�Է� : ");
			String str = sc.nextLine();
			if (str.equals("q")) break;
			sArr[count++]=str;
		}
		
		for (int i = 0; i < count; i++) {
			System.out.print(sArr[i]+", ");
		}
		
		
	}

}
