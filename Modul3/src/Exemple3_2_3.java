/*
Можно ли пользователю выбрать себе имя "Иван Иванов", если в уже есть другой пользователь с именем "иван иванов",
 считая, что регистр НЕ важен для вашей системы?
 */

public class Exemple3_2_3 {
    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Иван Иванов";
        System.out.print(user1.equalsIgnoreCase(user2));
    }
}
