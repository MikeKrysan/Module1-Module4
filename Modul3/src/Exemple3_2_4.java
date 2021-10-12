/*
Измените код из предыдущего задания так, чтобы в случае совпадения имен пользователей (без учета регистра) выводился ответ:
 "Выберите другое имя пользователя", а если имена не совпадают, выводится ответ: "Отличное имя!". В задании используйте методы из таблицы выше.
 */

public class Exemple3_2_4 {
    public static void main(String[] args) {
        String user1 = "Иван Иванов";
        String user2 = "иван иванов";
        boolean a = user1.equalsIgnoreCase(user2);
        if(a) {
            System.out.println("Выберите другое имя пользователя");
        } else
            System.out.println("Отличное имя!");
        //Или такой вариант:
        /*
        if(user1.equalsIgnoreCase(user2)==true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
        */
    }
}
