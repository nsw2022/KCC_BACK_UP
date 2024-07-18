package test;

public class Test2 {

	public static void main(String[] args) {
		// 배열 sequence에 대한 초기 데이터 선언
		int[] sequence = { 2, 3, -6, 1, 3, -1, 2, 4 };

		// 최종적으로 찾고자 하는 최대값을 저장할 변수
		long answer = 0;

		// 짝수 인덱스에서의 최대 누적합을 저장할 배열
		long[] sumEven = new long[sequence.length];
		// 홀수 인덱스에서의 최대 누적합을 저장할 배열
		long[] sumOdd = new long[sequence.length];

		// 첫 번째 원소를 사용하여 초기값 설정
		sumEven[0] = sequence[0];
		sumOdd[0] = sequence[0] * -1;

		// answer 초기값 설정 (첫 원소와 첫 원소의 음수 중 더 큰 값으로)
		answer = Math.max(sequence[0], sequence[0] * -1);

		// 배열을 순회하면서 최대 누적합을 계산
		for (int i = 1; i < sequence.length; i++) {
			// i가 짝수면 원래 값, 홀수면 음수 값을 num에 할당
			long num = (i % 2 == 0) ? sequence[i] : sequence[i] * -1;

			// 현재 num과 이전 sumEven 값의 합과 num 중 더 큰 값으로 sumEven[i] 갱신
			sumEven[i] = Math.max(sumEven[i - 1] + num, num);

			// 현재 num의 음수와 이전 sumOdd 값의 합과 num의 음수 중 더 큰 값으로 sumOdd[i] 갱신
			sumOdd[i] = Math.max(sumOdd[i - 1] + num * -1, num * -1);

			// 계산된 sumEven[i]와 sumOdd[i] 중 더 큰 값으로 answer 갱신
			answer = Math.max(answer, sumEven[i]);
			answer = Math.max(answer, sumOdd[i]);
		}

		// 계산된 최대값 출력
		System.out.println(answer);
	}

}
