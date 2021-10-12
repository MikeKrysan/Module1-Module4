/*
        Напишите программу, в которой создаются 2 «противоборствующих» объекта (от разных классов), состояние которых описывается параметрами:
     «имя» (строковый, необязательно), «здоровье» (целочисленный), «сила удара» (целочисленный), текущее состояние жив/не жив (логический).

    В основном или отдельном классе создать статический метод, который будет осуществлять «бой насмерть» (подсказка: в бесконечном цикле с каждой итерацией
 цикла от здоровья одного объекта будет вычитаться сила удара другого объекта, пока здоровье одного из объектов (или обоих, при равных условиях) не будет меньше либо равно нулю.

    По окончанию цикла сделать вывод в консоль с указанием, какой из объектов «победил».
 */

class Dog {

       String name = "Добервиль";
       int health = 119;
       int impactForce = 25;
       boolean isAlive = true;

}

class Cat {
        String name = "Коте";
        int health = 76;
        int impactForce = 40;
        boolean isAlive = true;
}


public class Fight2_8_5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        fight(cat, dog);
    }
    private static void fight(Cat cat, Dog dog) {
        while (true) {
            if(!dog.isAlive && cat.isAlive) {
                System.out.println("The dog " + dog.name + " is dead!");
                break;
            } else if(dog.isAlive && !cat.isAlive) {
                System.out.println("The cat " + cat.name + " is dead");
                break;
            } else if(!dog.isAlive && !cat.isAlive) {
                System.out.println("Both fighters are dead!");
                break;
            }
            if (cat.health < 0) {
                cat.isAlive = false;
            } else {
                cat.health -= dog.impactForce;
            }
            if (dog.health < 0) {
                dog.isAlive = false;
            } else {
                dog.health -= cat.impactForce;

            }
        }
    }
}
