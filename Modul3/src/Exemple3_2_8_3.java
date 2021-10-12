import java.util.Scanner;

/*
Добавьте некоторые улучшения в метод из предыдущего задания. Сделайте так, чтобы имя пользователя форматировалось по следующим правилам:

Самое короткое слово в имени должно быть на первом месте, а самое длинное — на последнем, то есть отсортируйте слова в имени по длине.
Сделайте так, чтобы каждое слово в имени было написано с большой буквы.
 */

public class Exemple3_2_8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        //Написать код здесь
        String[]  names= name.trim().split(" ");    //trim()- удаляет лишние пробелы в начале и конце строки, а split() - разделяет строку на массив, аргумент метода является разделителем
        return names.length == 3;
    }

    private static String formatName(String name) {
        //Написать код здесь
        String[] words = name.trim().split(" ");
        sortByLength(words);
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            char firstChar = str.charAt(0); // метод возвращает символ по указанному номеру
            if (!Character.isUpperCase(firstChar)) {    //если первый символ не с заглавной буквы, то заходим в тело ветвления:
                result += Character.toUpperCase(firstChar) + str.substring(1) + " "; //метод substring указывает, по какое значение будет выполнятся возведение буквы в верхний шрифт(согласно метода toUpperCase)
            } else {
                result += str + ""; //Иначе оставлять слово с Большой буквы
            }
        }
        return result;
    }

    private static void sortByLength(String[] words) {
        //Написать код здесь
        for (int i = 0; i < words.length - 1; i++) {        //некая самопальная сортировка
            for (int j = 0; j < words.length - 1; j++) {    //во вложенном цикле сравниваем первое и второе слово, то-же проделываем со вторым и третьим словом
                if (words[j].length() > words[j + 1].length()) {    //если первое слово длиннее второго, меняяем местами
                    String tmp = words[j];  //создаем переменную для хранения удаляемого удаляемого объекта (пример со стаканами пива и молока, когда нужно их перелить из одного в другой, берем третий стакан)
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }
            }
        }
    }

}

/*
метод sortByLength: (ввели с консоли "Крысань Миха сан") вложенный цикл for при первой итерации отсортирует следующим образом("Миха сан Крысань"), при i=1 отсортирует ("сан Миха Крысань")
 */