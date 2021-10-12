/*
Измените код из предыдущего задания так, чтобы вся проверка имени была выделена в отдельный метод с именем, например, checkUserName().
 */


public class Exemple3_2_5 {
    //мой вариант:
    /*
    public static void main(String[] args) {
        if(chekUserName() == true) {
            System.out.println("Выберите другое имя пользователя");
        } else
            System.out.println("Отличное имя!");
    }

        public static boolean chekUserName() {
            String user1 = "Иван Иванов";
            String user2 = "иван иванов";
            boolean a = user1.equalsIgnoreCase(user2);
            return a;
        }
    */

    //Вариант SkillFactory:

    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Иван Иванов";
        chekUserNames(user1, user2);
    }

    private static void chekUserNames(String user1, String user2) {
        if(user1.equalsIgnoreCase(user2)) {
            System.out.println("Выберите другое имя пользователя");
        } else
            System.out.println("Отличное имя!");
    }

}
