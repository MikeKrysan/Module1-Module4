/*
Реализуйте метод print(), в который передаются переменные string (строка) и n (число). Метод должен вывести вывести на экран строку string n раз с новой строки.

Пример:
string = "a", n = 3

Вывод:
a
a
a
 */

public class A7 {
    public void print(String string, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(string);
        }
    }
}
