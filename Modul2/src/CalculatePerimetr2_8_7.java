/*
Написать код расчета периметра равнобедренного треугольника, квадрата, окружности и вывести эти значения в консоль.
Параметры для расчета задаются статическими переменными, без ввода с клавиатуры.

Для расчета периметра фигуры необходимо создать свой класс.

Формат вывода:

Perimetr triangle =
Perimetr square =
Perimetr circle =
 */

public class CalculatePerimetr2_8_7 {
    public static void main(String[] args) {
        int sideLengthTriangle = 4;
        int sideLengthSquare = 5;
        int radius = 3;

        System.out.println("Perimetr Triangle: " + PerimetrTriangle(sideLengthTriangle));
        System.out.println("Perimetr Square: " + PerimetrSquare(sideLengthSquare));
        System.out.println("Perimetr Circle: " + PerimetrCircle(radius));

    }

    public static int PerimetrTriangle(int length) {
        int p = 3*length;
        return p;
    }

    public static int PerimetrSquare(int length) {
        int p = 4 * length;
        return p;
    }
    public static double PerimetrCircle(double radius) {
        double PI = 3.14;
        double p = 2*PI*radius;
        return p;
    }
}
