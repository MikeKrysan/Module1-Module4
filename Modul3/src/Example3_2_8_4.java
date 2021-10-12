
/*
Напишите метод, который форматирует номер телефона. Пользователь вводит номер телефона, а вам необходимо привести его к следующему виду:
 +7 ХХХ ХХХ ХХ ХХ. Например, строка 8(999)000 88 77 должна быть преобразована к виду: +7 999 000 88 77.

Не забудьте проверить корректность ввода! Это задание очень похоже на предыдущее, заготовка кода будет очень похожа, попробуйте написать весь класс самостоятельно.
 */

import java.util.Scanner;

public class Example3_2_8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectNumber = false;
        while (!isCorrectNumber) {
            String phoneNumber = scanner.nextLine(); //Считывает строку из System.in
            isCorrectNumber = checkPhoneNumberIsCorrect(phoneNumber);
            if (!isCorrectNumber) {
                System.out.println("Введите корректный номер телефона!");
            } else {
                System.out.println(formatNumber(phoneNumber));
            }
        }
    }

    private static boolean checkPhoneNumberIsCorrect(String phoneNumber) {
        String  clean = phoneNumber.replaceAll("[^0-9]", "");   //  метод replaceAll() заменяет каждую подстроку строки на новую (в данном случае на null)
        return clean.length() == 11;
    }

    private static String formatNumber(String phoneNumber) {
        String clean = phoneNumber.replaceAll("[^0-9]", "");
        String result = "+7" + " " + clean.substring(1, 4) + " " + clean.substring(4, 7) + " " + clean.substring(7, 9) + " " + clean.substring(9, 11); // метод substing() возваращает новую строку, которая является подстрокой данной строки
        return result;
    }

}
