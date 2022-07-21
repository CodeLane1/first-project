
/*the better way to adjust this code is below
        String firstName;
        do {
            System.out.print("Enter your first name: ");
            firstName = console.nextLine();
        } while (firstName.length() == 0);

        String lastName;
        do {
            System.out.print("What is your last name: ");
            lastName = console.nextLine();
        } while (lastName.length() == 0);

        String favoriteFood;
        do {
            System.out.print("What is your favorite food: ");
            favoriteFood = console.nextLine();
        } while (favoriteFood.length() == 0);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(favoriteFood);

 */

import java.util.Scanner;

    public class Methods {
        //1. method definitions --inert, doesnt do anything without a method call
        //2. method definitions are always inside the `class` code block
        //3. method definitions do not have to occur before a method call

        public static String readRequiredString(String prompt) {

            //4. code from out original `main` method now lives here.
            Scanner console = new Scanner(System.in);
            String result;
            do {
                System.out.print(prompt);
                result = console.nextLine();
            } while (result.length() == 0);
            return result;
        }

        public static void main(String[] args) {

            //5. method call --execute the method by providing a String argument.
            //The method call is an expression which resolves to a String.
            //We store the result in a String variable.
            String firstName = readRequiredString("Enter your first name: ");
            String lastName = readRequiredString("Enter your last name: ");
            String favoriteFood = readRequiredString("Enter your favorite food: ");


            System.out.println("First name     : " + firstName);
            System.out.println("Last name      : " + lastName);
            System.out.println("Favorite food  : " + favoriteFood);





    }
}
