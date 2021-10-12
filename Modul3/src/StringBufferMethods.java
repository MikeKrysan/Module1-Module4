public class StringBufferMethods {
    public static void main(String[] args) {
        // the append method
        StringBuffer javaStringBuffer = new StringBuffer("Java is ");
        javaStringBuffer.append("Great!!");
        System.out.println(javaStringBuffer);

        // insert method
        javaStringBuffer.insert(15, " yes..");
        System.out.println(javaStringBuffer);

        // replace method
        javaStringBuffer.replace(13,15, "??");
        System.out.println(javaStringBuffer);

        // reverse method
        javaStringBuffer.reverse();
        System.out.println(javaStringBuffer);
    }
}
