package test;

import java.util.Arrays;

public class TEST {
	public static void main(String[] args) {
        long startTime = System.nanoTime(); // 시작 시간 측정

        int[] sequence = {2, 3, -6, 1, 3, -1, 2, 4};
        int[] result = new int[sequence.length]; // 패턴: -1, 1 반복
        int[] result2 = new int[sequence.length]; // 패턴: 1, -1 반복

        for (int i = 0; i < sequence.length; i++) {
            result[i] = (i % 2 == 0 ? -1 : 1) * sequence[i];
            result2[i] = (i % 2 == 0 ? 1 : -1) * sequence[i];
        }

        int max1 = Arrays.stream(result).max().getAsInt();
        int max2 = Arrays.stream(result2).max().getAsInt();
        int secondMax1 = Arrays.stream(result).filter(num -> num != max1).max().getAsInt();
        int secondMax2 = Arrays.stream(result2).filter(num -> num != max2).max().getAsInt();

        int realResult = Math.max(max1 + secondMax1, max2 + secondMax2);

        long endTime = System.nanoTime(); // 종료 시간 측정
        long duration = (endTime - startTime); // 실행 시간 계산

        System.out.println("첫번째 배열 큰 값: " + max1);
        System.out.println("두번째 배열 큰 값: " + max2);
        System.out.println("첫번째 배열 두번째로 큰 값: " + secondMax1);
        System.out.println("두번째 배열 두번째로 큰 값: " + secondMax2);
        System.out.println("최종 결과: " + realResult);
        System.out.println("실행 시간(나노초): " + duration);
	}
}
