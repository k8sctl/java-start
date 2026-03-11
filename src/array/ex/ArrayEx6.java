package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        int maxValue;
        int minValue;

        System.out.println(count + "개의 정수를 입력하세요: ");
        for (int i = 0 ; i < count ; i++) {
            numbers[i] = scanner.nextInt();
        }

        maxValue = numbers[0];
        minValue = numbers[0];

        for (int i = 0 ; i < count ; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            } else if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minValue);
        System.out.println("가장 큰 정수: " + maxValue);
    }
}
