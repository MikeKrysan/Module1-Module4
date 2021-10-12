import java.util.Scanner;

/*
Напишите метод, который будет проверять, корректно ли пользователь ввёл полное имя. Не все написанное в методе main может
быть вам понятно, и это нормально (позднее мы будем разбирать эти конструкции), ваша задача — сосредоточиться на написании метода.

Нужно будет проверить, что во введённой строке 3 слова (если имя, фамилия или отчество пишутся через дефис, то это считается за одно слово).
 Если пользователь ввёл имя некорректно, например, в нём 2 или 4 и более слов, то вывести сообщение с просьбой ввести имя ещё раз.

Не забудьте удалить лишние пробелы в начале и конце строки.
 */

public class Exemple3_2_8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }
    }

    private static boolean checkName(String name) {
        //Написать код здесь
        String[] words = name.trim().split(" ");        //убираем пробелы в начале и конце стороки, а также разделяем строку на массив строк, указываем при этом, что пробел является разделителем.
        return words.length == 3;
    }
}
