/*
Напишите программу, в которой пользователя просят ввести имя и пароль. Пароль должен быть ограничен по размеру от 8 до 15 символов.
 В случае ввода неверного пароля программа должна запрашивать пароль снова и выводить на экран причину ошибки.

В случае, если пароль введен верно, программа должна выводить имя пользователя и его пароль. Удачи, и да прибудет с вами сила!
 */

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Exemple3_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя");
        String name  = scanner.nextLine();
        System.out.println("Создайте пароль");
        String password = scanner.nextLine();
        if(password.length()<8||password.length()>15) {

                System.out.println("Длина пароля должна составлять от 8 до 15 символов");
                password = scanner.nextLine();
        }

        System.out.printf("%s, Ваш новый пароль: %s", name, password);
    }
}
