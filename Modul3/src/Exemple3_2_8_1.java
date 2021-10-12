/*
Пользуясь таблицей методов для изменения строк, представленной выше в этом юните, реализуйте метод, который будет удалять
 из строки все пробелы, но уже с использованием новых методов.

В этом задании нельзя использовать посимвольный обход слова.
 */

public class Exemple3_2_8_1 {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
    }

    private static String removeWhiteSpaces(String str) {
        //Написать код здесь
        return(str.replaceAll(" ",""));
    }
}
