

public class Forloop {
    public static void main(String[] args) {

        /*
        Initialize: one-time set up before looping begins
        condition: a boolean expression, looping continues while it evaluates to true
        after-each-loop: operations that occur after each loop

        for (<initialize> ; <condition>; <after-each-loop>) {

        }
         */


        /*
        String message = "Looping...";

        //Standard format
        for (int index = 0; index < message.length(); index++) {
            System.out.println(message.charAt(index));
        }

        //This loop is formatted to demonstrate the clauses.
        //The format isn't standard and may be confusing to a Java developer
        for (int index = 0;
             index < message.length();
             index++
        ) {
            System.out.println(message.charAt(index));
        }

         */

        /*Counting to a specific number
        int sum = 0;
        //sum the numbers less than or equal to 10
        for (int n = 0; n <= 10; n++) {
            sum +=n;
        }
        System.out.println("Sum: " + sum); //Sum: 55

         */

        /*Counting down
        System.out.println("Countdown: ");
        for (int i = 10; i > 0; i --) {
            System.out.println(i);
        }
        System.out.println("Blast off!");

         */

        /*Counting by different numbers
        //count by 5 starting at 4 less than 100
        for (int i = 4; i < 100; i +=5) {
            System.out.println(i);
        }

         */

        /*Looking at each character in a string
        //in this case, we need one repetition for each character which can be determined with "value".length()
        String message = "Grouper, Halibut, and Trout";
        String vowels = "aeiou";
        String result = "";
        //remove all vowels from `message` and store the new string in `result`
        for (int i = 0; i < message.length(); i++) {
            if (vowels.indexOf(message.charAt(i)) < 0) {
                result += message.charAt(i);
            }
        }
        System.out.println("Result: " + result); //Result: Grpr, Hlbt, nd Trt

         */

        /*All for clauses are optional. A for statement with no clauses is an infinite loop. It loops forever.
        //interesting, but not that useful
        for (;;) {
            System.out.println("prints forever");
        }

         */

        /*The initialization and after-loop clauses can include multiple statements separated by commas
        //two initializations
        //a two-part condition
        //and two after-loop operations
        for (int a = 10, b = 0; a > 0 && b < 10; a--, b += 2) {
            System.out.printf("a:%s, b:%s %n", a, b);
        }

         */

        /*clauses can also include method calls
        //uses import java.util.Scanner
        Scanner console = new Scanner(System.in);
        System.out.print("Guess a fruit: ");
        for (String input = console.nextLine(); !input.equals("persimmon"); input = console.nextLine()) {
            System.out.printf("%s isn't correct.%nGuess a fruit: ", input);
        }
        System.out.println("You got it!");

         */






    }
}
