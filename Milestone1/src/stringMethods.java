public class stringMethods {
    public static void main(String[] args) {
        String message = "baked apples";
        int characterCount = message.length();
        System.out.println(characterCount);

        char fifthChar = message.charAt(4);
        System.out.println(fifthChar); //d

        char eighthChar = message.charAt(7);
        System.out.println(eighthChar);

        char firstChar = message.charAt(0);
        System.out.println(firstChar);
    }
}
