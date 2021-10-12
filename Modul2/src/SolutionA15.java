/*

Реализуйте метод years(), определяющий, является ли год високосным или нет. Метод должен вывести строку
 This year is a leap year или This year is not a leap year для високосного и невисокосного года соответственно.

Условия того, что год високосный:

Год делится на 400 без остатка — високосный.
В оставшихся годах, если год не делится без остатка на 100, то он тоже високосный.
В оставшихся годах, если год делится без остатка на 4, то он тоже високосный.
Остальные года не являются високосными.

*/

public class SolutionA15 {
    public static void years(int year) {
        boolean isLeap;
        if (year % 400 == 0) {isLeap = true;}
        else if (year % 100 == 0) {isLeap = false;}
        else if (year % 4 == 0) {isLeap = true;}
        else isLeap = false;

        System.out.println(isLeap ? "This year is a leap year" : "This year is not a leap year");
    }

    public static void main(String[] args) {
        years(2019);
    }
}
