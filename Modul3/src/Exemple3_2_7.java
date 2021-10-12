/*
Измените код из предыдущего задания так, чтобы после надписи о длине имени добавлялось замечание
 "А без пробелов ваше имя занимает <число> символов". Организуйте код таким образом, чтобы даже если имя состоит из трех слов,
  программа работала корректно.
 */


public class Exemple3_2_7 {
    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Вован Иванов";
        chekUserNames(user1, user2);
    }

    private static void chekUserNames(String user1, String user2) {
        String user2copy = user2.replace(" ","");   //здесь меняем пробел на его отсутствие!
        if(user1.equalsIgnoreCase(user2) == true) {
            System.out.println("Введите другое имя");
        } else
            System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину " + user2.length() + " символов");
            System.out.println("А без пробелов ваше имя занимает " + user2copy.length() + " символов");

    }
}