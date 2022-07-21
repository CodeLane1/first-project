import java.util.Scanner;

public class WritingToTheConsole {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a grocery item:");
        //nextLine returns a string
        String grocery = console.nextLine();

        System.out.print("What does it cost?: ");
        //grab string input first
        String input = console.nextLine();
        //then parse it into a double
        double cost = Double.parseDouble(input);

        System.out.print("How many are available?: ");
        //no need to assign the string to a variable
        //parse the string expression directly
        int inventory = Integer.parseInt(console.nextLine());

        System.out.print("Is it taxable? [true/false]: ");
        boolean isTaxable = Boolean.parseBoolean(console.nextLine());

        //report
        System.out.println();
        System.out.println("=======================");  //asthetic
        System.out.print(grocery);
        System.out.print(": $");
        System.out.println(cost);  //creates a new line after cost
        System.out.print("Current inventory: ");
        System.out.println(inventory);
        System.out.print("Taxable: ");
        System.out.println(isTaxable);
    }
}