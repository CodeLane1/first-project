public class Decisions {
    public static void main(String[] args) {

        int milesPerHour = 71;
        int speedLimit = 55;

        if (milesPerHour > speedLimit) {
            //can be empty but not useful
        }

        if (milesPerHour > speedLimit + 5) {

            System.out.println("Hmmmm...");
            System.out.println("You get a speeding ticket.");

            //we can declare new variables inside the block
            int expensiveTicketThreshold = speedLimit + 15;

            //nested `if` statements are absolutely allows.
            //this `if's` condition is only evaluatd if its parent's condition is `true`.
            //all code inside an `if's` code block is skipped if the condition is `false`.
            if (milesPerHour > expensiveTicketThreshold) {
                System.out.println("Worse, you get an expensive ticket.");
                System.out.println("Better luck next time.");
            }

            /* GOOD CODE
// Meets the course coding standards.
            if (hasFeathers) {
                System.out.println("very stylish");
            }

            if (likesCookies) {
                System.out.println("yum");
            }

            System.out.println("who doesn't like cookies?"); // it's now clear that this will always execute */

        }
    }
}
