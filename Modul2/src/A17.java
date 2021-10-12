/*
В метод numberToWorld() передается число в диапазоне от 0 до 999. Ваша задача реализовать этот метод так, чтобы он выводил в консоль описание этого числа.

even single digit number — если число четное и имеет одну цифру;
odd single digit number — если число нечетное и имеет одну цифру;
even two-digit number — если число четное и имеет две цифры;
odd two-digit number — если число нечетное и имеет две цифры;
even three-digit number — если число четное и имеет три цифры;
odd three-digit number — если число нечетное и имеет три цифры.
 */


public class A17 {
    public void numberToWorld(int number) {
        // write your code here
        String result = "";
        if (number % 2 == 0) result += "even ";
        else result += "odd ";

        if (number >= 0 && number < 10) result += "single digit ";
        else if (number >= 10 && number < 100) result += "two-digit ";
        else result += "three-digit ";

        System.out.println(result + "number");
    }
}
