package kosa.api.question;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        char[] test = {'1'};
//        System.out.println(Integer.parseInt(String.valueOf(test[0])));
        

        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        int maxNumber = findMaxNumber(input);
        System.out.println("최대 숫자: " + maxNumber);
    }

    public static int findMaxNumber(String input) {
        int[] numbers = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                int digit = Integer.parseInt(String.valueOf(c));
                numbers[digit]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        int result = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            while (numbers[i] > 0) {
                result = result * 10 + i;
                System.out.println("result : "+result + " i = "+i);
                numbers[i]--;
            }
        }
        System.out.println(Arrays.toString(numbers));
        return result;
    }
}
