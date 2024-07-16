package test;

public class GPT {
	public static void main(String[] args) {
		long startTime = System.nanoTime(); // 시작 시간 측정

		int[] sequence = {2, 3, -6, 1, 3, -1, 2, 4};

		// 패턴: -1, 1 반복
		int max1 = Integer.MIN_VALUE, secondMax1 = Integer.MIN_VALUE;
		// 패턴: 1, -1 반복
		int max2 = Integer.MIN_VALUE, secondMax2 = Integer.MIN_VALUE;
		for (int i = 0; i < sequence.length; i++) {
		    int currentValue1 = (i % 2 == 0 ? -1 : 1) * sequence[i];
		    if (currentValue1 > max1) {
		        secondMax1 = max1;
		        max1 = currentValue1;
		    } else if (currentValue1 > secondMax1) {
		        secondMax1 = currentValue1;
		    }

		    int currentValue2 = (i % 2 == 0 ? 1 : -1) * sequence[i];
		    if (currentValue2 > max2) {
		        secondMax2 = max2;
		        max2 = currentValue2;
		    } else if (currentValue2 > secondMax2) {
		        secondMax2 = currentValue2;
		    }
		}

		int realResult = Math.max(max1 + secondMax1, max2 + secondMax2);

		long endTime = System.nanoTime(); // 종료 시간 측정
		long duration = (endTime - startTime); // 실행 시간 계산

		System.out.println("Duration: " + duration + "ns");
		System.out.println("Result: " + realResult);

	}
}
