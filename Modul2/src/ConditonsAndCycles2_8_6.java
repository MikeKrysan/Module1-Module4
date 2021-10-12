/*
    Необходимо закомментировать некоторые из строк так, чтобы переменная a приняла значение 18. Вывести её в консоль 20 раз.
 */

public class ConditonsAndCycles2_8_6 {
    public static void main(String[] args) {
        int a = 4, b = 3, c = 2;
       // b = b + c;      //b =
       // a = a * b;      //a =
       // c = a - c;      //c =
        a = a + b;      //a = 7
       // a = a - b;      //a =
        c = a + b;      //c = 10
        b = c / a;      //b = 1
       // a = b + c;      //a =
        a = a + c + b;  //a = 18

        // Напишите здесь свой код

        for(int i = 0; i<20; i++) {
            System.out.println(a);
        }
    }
}
