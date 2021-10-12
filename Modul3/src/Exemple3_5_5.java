/*
В классе Main объявлен массив numbers. Заполните его числами так, чтобы содержимое выглядело следующим образом:
[1, -2, 3, -4, 5, …, -98, 99, -100]. Советуем использовать циклы. Не меняйте модификаторы доступа переменных!
 */

import java.util.Arrays;

public class Exemple3_5_5 {
    public static int[] numbers = new int[100];

    public static void main(String[] args) {
        // code here...
        numbers[0] = 1;

        for (int i = 0, stop = numbers.length; i < stop; i++) {
            numbers[i] = (int) (Math.pow(-1, i) * (numbers[i] + i));
        }
        //
        System.out.println(Arrays.toString(numbers));
    }
}
