/*
Нужно написать программу, которая выводит на консоль простые числа в промежутке от 2 до 100.

 */

public class OutputNumbers2_8_9 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isExit = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isExit = false;
                    break;
                }
            }

            if (isExit) {
                System.out.println(i);
            }
        }
    }
}
