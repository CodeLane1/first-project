import java.util.Scanner;

public class AmusementPark {

    public static void main(String[] args) {
        // Scanner
        Scanner console = new Scanner(System.in);

        System.out.println("Welcome to the Amusement Park App");

        boolean continueLoop;
        do {
            // Prompt the user for the customer's name
            System.out.print("Please tell me your name: ");
            String personName = console.nextLine();

            System.out.printf("%nWelcome %s%n%n", personName);

            // Ask the user how many people are in their customer's party
            System.out.print("How many people are in your party?: ");
            int partyInput = Integer.parseInt(console.nextLine());

            System.out.println("Number of people in the party - " + partyInput);

            double total = 0;
            // For every person in customer's party...
            // Loop (for loop or while)

            // for loops - amazing if you know the amount of loops ahead of time
            for(int loopNumber = 0; loopNumber < partyInput; loopNumber++) {
                System.out.println(
                        "\nHow old is person " + (loopNumber + 1) +":\n" +
                                "\t1. Seniors 65 on up - $5.50\n" +
                                "\t2. Adults ages 12 - 64 - $10.00\n" +
                                "\t3. Children ages 6 - 12 - $5.50\n" +
                                "\t4. Babies 5 and under - Free\n" +
                                "\t5. Coupon - $3.00\n" +
                                "\t6. Food Shelf donation - 5 cans\n"
                );
                System.out.print("What is your selection [1-6]: ");
                int selection = Integer.parseInt(console.nextLine());
                System.out.println();

                switch (selection) {
                    case 1:
                        System.out.println("This is part of case 1");
                    case 3:
                        System.out.println("This is part of case 3");
                        System.out.println("Adding $5.50 to the total.");
                        total += 5.50;
                        break;
                    case 2:
                        System.out.println("Adding $10.00 to the total.");
                        total += 10.00;
                        break;
                    case 4:
                        System.out.println("Free!!");
                        break;
                    case 5:
                        System.out.println("Adding $3.00 to the total.");
                        total += 3.00;
                        break;
                    case 6:
                        System.out.println("That will be 5 cans please");
                        break;
                    default:
                        System.out.println("I don't recognize that input");
                        loopNumber--;
                        break;
                }


            }

            // Display the total ticket price (format to 2 decimal places)
            System.out.printf("%s, your total is: $%.2f%n", personName, total);

            // Prompt the user if they want to buy more tickets or exit
            System.out.print("Are there more people to buy tickets [y/n]: ");
            String continueInput = console.nextLine();
            continueLoop = continueInput.equalsIgnoreCase("y");

        } while (continueLoop);
    }

}
