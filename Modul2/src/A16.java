/*
    Имеется алгоритм работы светофора для пешеходов. В начале каждого часа 3 минуты горит зеленый, затем в течение 1 минуты — желтый,
     после 1 минуту горит красный, далее цикл повторяется (снова зеленый, потом желтый и т.д). В метод signal() передается вещественное (double) число n,
      время в минутах, прошедшее с начала очередного часа. Ваша задача — определить, какой сигнал светофора горит в данный момент, и вывести на экран:
 */

public class A16 {
    public static void signal(double time) {
        // write your code here
        time %= 5;

        if (time >= 0 && time < 3) System.out.println("green");
        else if (time >= 3 && time < 4) System.out.println("yellow");
        else System.out.println("red");
    }

    public static void main(String[] args) {
        signal(9.1);
    }
}
