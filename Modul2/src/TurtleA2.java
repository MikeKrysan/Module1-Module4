/*
Напишите программу, выдающую черепашкам имена, дописав метод setName().
 */

public class TurtleA2 {
    String name = "";

    public void setName(String n) {
        //write your code hear
        name = n;
    }

    public static void main(String[] args) {
        TurtleA2 turtle = new TurtleA2();
        turtle.setName("Arkadiy Ivanovich");
        System.out.println(turtle.name);
    }
}
