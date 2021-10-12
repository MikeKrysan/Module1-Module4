/*+
    Допишите метод numbers(), так чтобы он выводил информацию о числах.
    Дается 3 числа, вывести на экран строку вида {n positive, m negative, k equal 0}.
 */

public class A6 {
    public void numbers(int a, int b, int c) {
        int positive = 0, negative = 0, zero = 0;
        if (a > 0) positive++;
        else if (a < 0) negative++;
        else zero++;

        if (b > 0) positive++;
        else if (b < 0) negative++;
        else zero++;

        if (c > 0) positive++;
        else if (c < 0) negative++;
        else zero++;

        System.out.println(positive + " positive, " + negative + " negative, " + zero + " equal 0");
    }
}
