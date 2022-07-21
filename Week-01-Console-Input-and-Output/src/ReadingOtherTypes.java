import java.util.Scanner;

public class ReadingOtherTypes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter a grocery item:");
        //nextLine returns a string
        String grocery = console.nextLine();

        System.out.println("What does it cost?");
        //grab string input first
        String input = console.nextLine();
        //then parse it into a double
        double cost = Double.parseDouble(input);

        System.out.println("How many are available");
        //no need to assign the string to a variable
        //parse the string expression directly
        int inventory = Integer.parseInt(console.nextLine());

        System.out.println("Is it taxable? [true/false]");
        boolean isTaxable = Boolean.parseBoolean(console.nextLine());

        //report

        System.out.println();   //just creates a space
        System.out.println("=======================");  //asthetic
        System.out.println(grocery + ": $" + cost);
        System.out.println("Current inventory: " + inventory);
        System.out.println("Taxable: " + isTaxable);

    }
}
