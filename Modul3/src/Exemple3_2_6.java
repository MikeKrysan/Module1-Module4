/*
Измените код из предыдущего задания так, чтобы в случае, если имя пользователя уникальное, пользователю также сообщалось
 бы "Ваше имя имеет длину <длина имени> символов", где вместо <длина имени> стоит соответствующее число. Проверьте,
 что ваша программа работает корректно, заменив имя "Иван" на другое, например, "Вован". В задании используйте методы из таблицы выше.
 */

public class Exemple3_2_6 {
    public static void main(String[] args) {
        //мой вариант
        /*
        String user1 = "вован иванов";
        String user2 = "Дмитрий Иванов";
        chekUserNames(user1, user2);
    }

    private static void chekUserNames(String user1, String user2) {
        if(user1.equalsIgnoreCase(user2)) {
            System.out.println("Выберите другое имя пользователя");
        } else if(user1.length() > user2.length()) {
            int a = user1.length();
            System.out.println("Ваше имя имеет длину " + a + " символов");
        } else if(user1.length() < user2.length()) {
            int b = user2.length();
            System.out.println("Ваше имя имеет длину " + b + " символов");
        } else
            System.out.println("Отличное имя!");
         */

        //Вариант SkillFactory:
        String user1 = "иван иванов";
        String user2 = "Вован Иванов";
        chekUserNames(user1, user2);
    }

    private static void chekUserNames(String user1, String user2) {
        if(user1.equalsIgnoreCase(user2) == true) {
            System.out.println("Введите другое имя");
        } else
            System.out.println("Отличное имя!");
        System.out.println("Ваше имя имеет длину " + user2.length() + " символов");
    }

}

//P.S: мне мой вариант нравится больше, так как рассмотрены вариации изменея длины имен для обоих вариантов, а не только для второго, как в примере с SkillFactory