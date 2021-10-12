/*
Если у вас не возникло никаких вопросов по первому заданию и вы с ним легко справились, давайте усложним принцип работы калькулятора:

Настоящий калькулятор выполняет операцию, например, складывает 2 и 3, и после этого получившийся результат становится первым операндом для новой операции.
Т.е. на экран калькулятора будет выведено 5, а после этого вы можете ввести новую операцию.
Как только пользователь вводит символ ‘C’, предыдущие вычисления сбрасываются, результат обнуляется и весь процесс начинается сначала.
Добавьте кнопку выключения. При вводе команды ‘s’ программа должна завершать свою работу.
Реализуйте такой «бесконечный» калькулятор. Для улучшения понимания задачи ответьте на следующие вопросы:

?
Какой оператор позволяет вводить значения бесконечно?
Как очистить текущие значения при вводе символа ‘c’?
Каким оператором можно осуществить остановку выполнения программы?
Реализацию усложненного калькулятора мы покажем в следующем модуле.
 */

import java.util.Scanner;


public class Calculator1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double val1;
        double val2;
        char operand;
        char calculatorOperator = 'c';
        double result = 0;

        do {
            if(calculatorOperator == 'c') {
                System.out.println("Введите первый операнд:");
                val1 = getDouble();
                System.out.println("Введите оператор (+,-,*,/):");
                operand = getOperation();
            } else {
                val1 = result;
                operand = calculatorOperator;
            }
            System.out.println("Введите следующий операнд:");
            val2 = getDouble();

            result = calculator(val1, val2, operand);
            System.out.println(val1 + " " + operand + " " + val2 + " = " + result);
            calculatorOperator = scanner.next().charAt(0);
        } while (calculatorOperator != 's');

    }

    public static double calculator(double val1, double val2, char operand) {
        return switch (operand) {
            case ('+')-> val1 + val2;
            case ('-')-> val1 - val2;
            case ('*')-> val1 * val2;
            case ('/')-> val1 / val2;
            default-> {
                System.out.println("Введите правильное значение операнда :");
                yield  0;
            }
        };

    }

    public static double getDouble() {
        double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getDouble();
        }
        return num;
    }

    public static char getOperation() {
        char operand;
        if(scanner.hasNext()){
            operand = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operand = getOperation();
        }
        return operand;
    }

}


