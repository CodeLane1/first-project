import java.util.Scanner;

public class tet {


    // Based on https://en.wikipedia.org/wiki/Coraline
    /* Layout
    bobinski
      |        other-mother
      |           /
    front -- living-room -- garden
      |
      |
    spink-forcible
     */

    public static void main(String[] args) {

        // Coraline's current location.
        String location = "front";

        // Must find these three items to win.
        boolean hasBall = false;
        boolean hasRing = false;
        boolean hasShifter = false;

        // Receive commands.
        Scanner console = new Scanner(System.in);
        String command = null;

        while (!location.equals("done")) {

            switch (location) {
                case "front":
                    System.out.println("You are in front of the Pink Palace Apartments.");
                    System.out.println("There's door leading inside to the east.");
                    System.out.println("Miss Spink and Miss Forcible's apartment is down.");
                    System.out.println("Mr. Bobinski's apartment is up.");
                    System.out.print("?: ");
                    command = console.nextLine();
                    if (command.equalsIgnoreCase("up")) {
                        location = "bobinski";
                    } else if (command.equalsIgnoreCase("down")) {
                        location = "spink-forcible";
                    } else if (command.equalsIgnoreCase("east")) {
                        location = "living-room";
                    } else {
                        System.out.println("I don't understand that command.");
                    }
                    break;
                case "spink-forcible":
                    System.out.println("Your are in Miss Spink and Miss Forcible's apartment.");
                    System.out.println("The front of the Pink Palace Apartments is up.");
                    if (!hasRing) {
                        System.out.println("There is ring in a candy dish.");
                    }
                    System.out.print("?: ");
                    command = console.nextLine();
                    if (command.equalsIgnoreCase("up")) {
                        location = "front";
                    } else if (command.equalsIgnoreCase("take")) {
                        hasRing = true;
                    } else {
                        System.out.println("I don't understand that command.");
                    }
                    break;
                case "bobinski":
                    System.out.println("Your are in Mr. Bobinski's apartment.");
                    System.out.println("The front of the Pink Palace Apartments is down.");
                    if (!hasBall) {
                        System.out.println("There is red ball with a yellow star on the floor.");
                    }
                    System.out.print("?: ");
                    command = console.nextLine();
                    if (command.equalsIgnoreCase("down")) {
                        location = "front";
                    } else if (command.equalsIgnoreCase("take")) {
                        hasBall = true;
                    } else {
                        System.out.println("I don't understand that command.");
                    }
                    break;
                case "living-room":
                    System.out.println("You are in your apartment living room.");
                    System.out.println("There's a door to the front of the Pink Palace Apartments to the west.");
                    System.out.println("There's a door to the garden to the east.");
                    System.out.println("There's a foreboding small door covered by wall paper to the north.");
                    System.out.print("?: ");
                    command = console.nextLine();
                    if (command.equalsIgnoreCase("west")) {
                        location = "front";
                    } else if (command.equalsIgnoreCase("east")) {
                        location = "garden";
                    } else if (command.equalsIgnoreCase("north")) {
                        location = "other-mother";
                    } else {
                        System.out.println("I don't understand that command.");
                    }
                    break;
                case "garden":
                    System.out.println("You are in the garden.");
                    System.out.println("There's a door leading inside to the west.");
                    if (!hasShifter) {
                        System.out.println("There's a loose gear shifter on the garden tractor.");
                    }
                    System.out.print("?: ");
                    command = console.nextLine();
                    if (command.equalsIgnoreCase("west")) {
                        location = "living-room";
                    } else if (command.equalsIgnoreCase("take")) {
                        hasShifter = true;
                    } else {
                        System.out.println("I don't understand that command.");
                    }
                    break;
                case "other-mother":
                    System.out.println("You enter your Other Mother's hidden room.");
                    if (hasBall && hasRing && hasShifter) {
                        System.out.println("You have the items you need to defeat her and she is vanquished.");
                        System.out.println("You win!");
                    } else {
                        System.out.println("You are missing the:");
                        if (!hasBall) {
                            System.out.println("- Ball");
                        }
                        if (!hasRing) {
                            System.out.println("- Ring");
                        }
                        if (!hasShifter) {
                            System.out.println("- Shifter");
                        }
                        System.out.println("The Other Mother takes your eyes.");
                        System.out.println("You lose!");
                    }
                    location = "done";
                    break;
                default:
                    location = "front";
            }
        }
    }
}