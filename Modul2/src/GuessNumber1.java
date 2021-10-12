import java.util.Random;
import java.util.Scanner;

public class GuessNumber1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner consol = new Scanner(System.in);
        System.out.println("Введите максимальное количество попыток: ");
        int turnQuantity = consol.nextInt();
        System.out.println("Введите верхнее предельное значение диапазона угадываемого числа: ");
        int upperNumber = consol.nextInt();
        System.out.println("Введите нижнее предельное значение диапазона угадываемого числа: ");
        int lowerNumber = consol.nextInt();

        int randInt = lowerNumber + rand.nextInt(upperNumber);  //Сохраняем рандомное число
        int counter = 1;                                        //создаем счетчик для подсчета количества зделанных мною попыток
        boolean status = false;                                 //Создаем булевую переменную для статуса угадал/ не угадал

        while(counter <= turnQuantity) {
            System.out.println("Итак, вы думаете, что загаданное пк число, это: ");
            int userInput = consol.nextInt();                   //сохраняем в данную переменную введеную пользователем число
            if(userInput == randInt) {
                System.out.println("Опана! Неужели?! Вы угадали число, поздравляем!");
                status = true;
                break;
            }   else if(userInput > randInt) {
                System.out.println("Загаданное мною число больше");
                status = false;
            }   else if(userInput < randInt) {
                System.out.println("Загаданое мною число меньше");
                 status =  false;
            }
            counter++;

        }
        if(status == false) {
            System.out.println("Конец игры! Я (ПК) загадал число: " + randInt);
            System.out.println("Ваше количество попыток составило: " + counter);
        }
    }
}