/*
Допишите метод print() так, чтобы он выводил на экран прямоугольник m на n, состоящий из восьмерок. m и n — целые числа, передающиеся в метод.

Пример:

 m = 2, n = 4

Вывод:

8888
8888
 */

public class A11 {
    public static void print(int m, int n) {
        //write your code here
        for (int i = 0; i < m; i++) {
            String s = "";
            for (int j = 0; j < n; j++) {
                s += "8";
            }
            System.out.println(s);
        }
    }
}
