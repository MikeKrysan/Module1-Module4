/*
    Напишите метод findMaximum(), в который передается 4 числа: a, b, c, d. Метод должен найти максимальное число среди
    данных и вывести его на экран. Если таких чисел несколько, выведите любое из них.
 */

public class MaximumOfNumbersA3 {
    public void max(int a, int b, int c, int d) {
        int max1 = a > b ? a : b;
        int max2 = c > d ? c : d;
        int max = max1 > max2 ? max1 : max2;
        System.out.println("Maximum of numbers: " + max);
    }
}
