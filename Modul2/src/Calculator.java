/*import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int operand1 = scanner.nextInt();
        System.out.println("Введите операнд (+,-,*,/):");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите второе целое число:");
        int operand2 = scanner.nextInt();

        int itogo = calculator(operand1, operand2, operation);

        System.out.println("Результат: " + itogo);

    }

    public static int calculator(int operand1, int operand2, char operation) {

        int rezult = 0;

        switch (operation) {
            case ('+'):
                rezult = operand1 + operand2;
                break;
            case ('-'):
                rezult = operand1 - operand2;
                break;
            case ('*'):
                rezult = operand1 * operand2;
                break;
            case ('/'):
                rezult = operand1 / operand2;
                break;
            default:
                System.out.println("Введите числа и операнд");
        }
        return rezult;

    }
}
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int operand1 = scanner.nextInt();
        System.out.println("Введите операнд (+,-,*,/):");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите второе целое число:");
        int operand2 = scanner.nextInt();

        int rezult = calculator(operand1, operand2, operation);

        System.out.println("Результат:" + rezult);

    }

    public static int calculator(int operand1, int operand2, char operation) {

        int rezult = 0;

        switch (operation) {
            case ('+'):
                rezult = operand1 + operand2;
                break;
            case ('-'):
                rezult = operand1 - operand2;
                break;
            case ('*'):
                rezult = operand1 * operand2;
                break;
            case ('/'):
                if (operand2 == 0) {
                    System.out.println("На ноль делить нельзя!");
                } else {
                    rezult = operand1 / operand2;
                    break;
                }

            default:
                System.out.println("Введите числа и операнд");
        }
        return rezult;
    }

}

