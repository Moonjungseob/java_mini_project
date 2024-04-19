package ex_2;

import java.util.Scanner;

public class limchaesu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNumber = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("두 숫자의 합: " + sum);

        scanner.close();
    }
}






