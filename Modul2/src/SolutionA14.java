/*  Напишите метод findFactorial(). Этот метод должен реализовывать нахождение факториала переданного в него числа n и вывод его (факториала числа n) на экран.*/

public class SolutionA14 {

    public static void findFactorial(int n) {
        int res = 1;
        for(int i = 1; i <= n; i++){
            res *= i;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        findFactorial(4);
    }

}
