/*
Напишите метод findMedian(), который принимает 3 числа и должен вывести максимально среднее из них,
то есть не самое маленькое и не самое большое. Если числа одинаковые — вывести любое из них.
 */

public class MedianOfNumbersA9 {
    public void findMedian(int a, int b, int c) {
        //write your code here
        if ((a >= b && a <= c) || (a >= c) && a <= b) System.out.println(a); // if a is median
        else if ((b >= a && b <= c) || (b >= c && b <= a)) System.out.println(b); // if b is median
        else System.out.println(c); // else c - median
    }
}
