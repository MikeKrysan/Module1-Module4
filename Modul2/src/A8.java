/*
    Реализуйте метод numbers(), который должен вывести на экран четные числа от 1 до 100 включительно, используя цикл for.
      Каждое значение вывести с новой строки.
 */

public class A8 {
    public void numbers() {
        //write your code hear
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}
