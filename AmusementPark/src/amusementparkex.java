import java.util.Scanner;

public class amusementparkex {
    public static void main(String[] args) {


//scanner
        Scanner console = new Scanner(System.in);

// Prompt the user for the customers name
        System.out.println("Welcome to the Amusement Park app");

        boolean continueLoop;
        do {
            System.out.print("Please tell me your name: ");
            String personName = console.nextLine();

            System.out.printf("%nWelcome %s%n%n", personName);

//Ask the user how many people are in their customers party
            System.out.print("How many people are in your party?: ");
            int partyInput = Integer.parseInt(console.nextLine());

            System.out.println("Number of people in the party - " + partyInput);

            //For every person in customers party...
//loop (for loop or while)
            //for loops amazing if you know the amount of loops ahead of time
//declare total so its accessible after loop finished
            double total = 0;
/*
            for (int i = 0; i < partyInput; i++) {

                //ask what their age is

                System.out.print("What is the name of person " + (i + 1) + ": ");
                String name = console.nextLine();

                System.out.print("How old is person " + (i + 1) + ": ");
                int age = Integer.parseInt(console.nextLine());


                System.out.printf("%s is %s%n", name, age);


                if ((age >= 65) || (age >= 6 && age < 12)) {
                    System.out.println("Adding $5.50 to the total.");
                    total += 5.50;
                } else if (age >= 12) {
                    System.out.println("Adding $10.00 to the total.");
                    total += 10.00;
                } else {
                    System.out.println("Babies are free");
                }

            }

 */

            for (int loopNumber = 0; loopNumber < partyInput; loopNumber++) {
                // alternative is to present a menu of options and make the selection smaller
                System.out.println(
                        "\nHow old is person " + (loopNumber + 1) + ":\n" +
                                "\t1. Seniors on up - $5.50\n" +
                                "\t2. Adults 12-  64: $10.00\n" +
                                "\t3. Children ages 6 - 12 - $5.50\n" +
                                "\t4. Babies 5 and under - Free\n" +
                                "\t5. Coupon - $3.00\n" +
                                "\t6. Food Shelf dontation - 5 cans\n"

                );
                System.out.print("What is your selection [1-6]: ");
                int selection = Integer.parseInt(console.nextLine());
                System.out.println();

                switch (selection) {
                    case 1: //if (selection == 1)
                    case 3:
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
                    default: //identical to `else` where we catch if nothing else catches
                        System.out.println("I don't recognize that input");
                        // we need to something here to make the loop go backward one.
                        loopNumber--; //incase the user inputs something there not supposed to like 7 it wont skip that person
                        break;

                }


            }

            //display the total ticket price (format to 2 decimal places)
            System.out.printf("%s, your total is: $%.2f%n", personName, total);

            //prompt user if they want to buy more tickets or exit
            System.out.println("Are there more people to buy tickets [y/n]: ");
            String continueInput = console.nextLine();
            // continueLoop = continueInput.toLowerCase(Locale.ROOT).equals("y"); //both work
            continueLoop = continueInput.equalsIgnoreCase("y");


        } while(continueLoop);



    }
}
