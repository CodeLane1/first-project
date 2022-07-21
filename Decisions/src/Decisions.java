import java.util.Scanner;

public class Decisions {
    public static void main(String[] args) {
        /* The anatomy of an if statement
if (boolean-expression) { }
^  ^        ^         ^  ^
|  |        |         |  |
|  |        |         | code block
|  |        |         |
|  |        |    close parenthesis
|  |        |
|  | boolean expression, condition
|  |
| open parenthesis
|
if keyword
*/              /*
        if (true) {
            System.out.println("It's true.");  //expression is true so it runs
        }

        if (false) {
            System.out.println("It's true.");  */


            //==============================================================================================//

            int milesPerHour = 67;
            int speedLimit = 55;
            boolean knowsOfficer = false;

            if (milesPerHour > speedLimit) {
                System.out.println("Officially, you're speeding.");
            }

            if (milesPerHour > speedLimit + 5 && !knowsOfficer) {
                System.out.println("You get a speeding ticket.");
            }
        }
    }
//}
