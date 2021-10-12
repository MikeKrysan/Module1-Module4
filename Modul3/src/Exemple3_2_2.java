/*Можно ли пользователю выбрать себе имя "Иван Иванов", если уже есть другой пользователь с именем "иван иванов", считая,
 что регистр важен для вашей системы?*/

public class Exemple3_2_2 {
    public static void main(String[] args) {
        String s1 = "Иван Иванов";
        String s2 = "иван иванов";
        boolean a = s1.equals(s2);
        System.out.println(a);
        /*

        // Или такой вариант
        String s1 = "Иван Иванов";
        String s2 = "иван иванов";
        System.out.println(s1.equals(s2));
         */
    }
}


