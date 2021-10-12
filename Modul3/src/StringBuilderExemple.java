public class StringBuilderExemple {
    public static void main(String[] args) {
        StringBuilder skiResort = new StringBuilder("Big Sky");
        System.out.println(skiResort);

        // Appending a string
        skiResort.append(" Montana");
        System.out.println(skiResort);

        // Append char array
        char[] hasCharArray = new char[] { ' ', 'h', 'a', 's', ' ' };
        skiResort.append(hasCharArray);
        System.out.println(skiResort);

        // Append an int
        skiResort.append(12);
        System.out.println(skiResort);

        // Appending another string
        skiResort.append(" lifts.");
        System.out.println(skiResort);

    }

}

/*
Here is an example of using the append() method from StringBuilder. This is probably the most often used method.
We create a StringBuilder object and then add to it with the append() method. Notice how we can append different objects such as a String,
char array, and an int.

 */