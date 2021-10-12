/*
    Реализуйте метод checkTriangle(), метод принимает 3 числа: a, b, c. Задача метода — определить,
     существует ли треугольник с такими сторонами, если существует, то вывести на экран YES, иначе — NO.
 */

public class A10 {
    public void checkTriangle(int a, int b, int c) {
        //write your code here
        if ((a < b + c) && (b < c + a) && (c < a + b)) System.out.println("YES");
        else System.out.println("NO");
    }
}
