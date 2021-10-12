/*
В классе Main дана строка. Выведите в столбик ее подстроки так, чтобы каждую итерацию пропадали первый и последний ее символы. Выводите до тех пор, пока не останется 1 или 2 символа. Пример для строки "helloworld":

helloworld
elloworl
llowor
lowo
ow
Внимание: меняйте данную строку! После выполнения программы ее длина должна быть равна либо 1, либо 2.
 */

public class Exemple3_5_10 {
    public static String string = "helloworld";

    public static void main(String[] args) {
        while (string.length() > 2) {
            string = string.substring(1, string.length() - 1);
            System.out.println(string);
        }
        //
    }
}

//Метод substring() в Java имеет два варианта и возвращает новую строку, которая является подстрокой данной строки.
// Подстрока начинается с символа, заданного индексом, и продолжается до конца данной строки или до endIndex-1, если введен второй аргумент.

/*
Пример
import java.io.*;

public class Test {

   public static void main(String args[]){
      String Str = new String("Добро пожаловать на ProgLang.su");

      System.out.print("Возвращаемое значение: ");
      System.out.println(Str.substring(5));

      System.out.print("Возвращаемое значение: ");
      System.out.println(Str.substring(5, 15));
   }
}
Получим следующий результат:

Возвращаемое значение:  пожаловать на ProgLang.su
Возвращаемое значение:  пожаловат
 */