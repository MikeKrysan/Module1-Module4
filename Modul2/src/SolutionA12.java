/*В метод isPow() передается 1 целое число. Ваша задача выяснить, является ли это число степенью двойки (например, число 64 — это ).
        Если является, то вывести в консоль эту степень (например 6 для числа 64), иначе — строку NO.
*/

public class SolutionA12 {
    public static void isPow(int n) {
        int count = 0, now = 1;
        while (now < n) {
            now *= 2;
            count++;
        }
        if (now == n) System.out.println(count);
        else System.out.println("NO");
    }

    public static void main(String[] args) {
        isPow(64);
    }
}
