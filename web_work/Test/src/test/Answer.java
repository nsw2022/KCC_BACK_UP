package test;

public class Answer {

	public static void main(String[] args) {
		long startTime = System.nanoTime(); // 시작 시간 측정
        int[] sequence = {2, 3, -6, 1, 3, -1, 2, 4};
		long answer = 0;
		boolean isPlus = true;
		long purse1 = 0;
		long purse2 = 0;
		for (int num : sequence) {
			purse1 += isPlus ? num : -num;
			purse2 += isPlus ? -num : num;
			purse1 = Math.max(0, purse1);
			purse2 = Math.max(0, purse2);
			System.out.println(num+"\t\t"+purse2);
			answer = Math.max(answer, Math.max(purse1, purse2));
			isPlus = !isPlus;
		}
		System.out.println(answer);
		 long endTime = System.nanoTime(); // 종료 시간 측정
	     long duration = (endTime - startTime); // 실행 시간 계산
	     System.out.println(duration);

	}

}
