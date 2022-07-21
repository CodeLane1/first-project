

public class MinInteger {

    public static int minimum(int a, int b, int c) {
        int min = Math.min(a,b);
        //The return expression is an `int`, which matches the output data types.
        return Math.min(c, min);
    }
    /*use
    public static void main(String[] args) {
        int result = minimum(1, 2, 3); //1
        System.out.println(minimum(1000, 0, -1000)); //-1000
        System.out.println(minimum(255, 255, 255));  //255
    }

     */

    //######################################################################

    //define
    public static char randomLetter() {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int index = (int) (Math.random() * 26);
        return letters.charAt(index);
    }

    /*use
    public static void main(String[] args) {
        char letter = randomLetter();
        System.out.println(letter);
        System.out.println(randomLetter());
        System.out.println(randomLetter());
    }

     */

    //define
    //new keyword: `void`
    //Indicates that a method does NOT return a value.
    public static void repeatPrintln(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    /*use
    public static void main(String[] args) {
        System.out.println("Your garden:");
        repeatPrintln("hosta", 3);
        repeatPrintln("peony", 2);
        repeatPrintln("dandelion", 3);
        repeatPrintln("ghostflower", -9);
    }

     */


}
