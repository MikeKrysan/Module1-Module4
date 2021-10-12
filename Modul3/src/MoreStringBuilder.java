public class MoreStringBuilder {
    public static void main(String[] args) {
        // StringBuilder has three constructors
        StringBuilder emptyConstructor = new StringBuilder();
        StringBuilder stringSpecified = new StringBuilder("Here is a string to start");
        StringBuilder lengthSpecified = new StringBuilder(10);

        // insert method
        emptyConstructor.insert(0, "adding to the empty StringBuilder");
        System.out.println(emptyConstructor);

        // replace method
        stringSpecified.replace(0, 4, "There");
        System.out.println(stringSpecified);

        // length method
        System.out.println(lengthSpecified.length());
    }
}

/*
StringBuilder has three main constructors that we see in this example. There is the empty constructor, the option to specify a String,
 and the constructor that takes an int to determine the length. Also, we show some of the other methods like insert, replace, and length.
 */