import java.util.Scanner;

public class Switchfallthrough {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter your patron level: ");
        String patronLevel = console.nextLine()
                .trim()
                .toLowerCase();

        System.out.printf("Patron perks for %s support:%n", patronLevel);

        switch (patronLevel) {
            case "platinum":
                System.out.println("- one-on-one video chat.");
            case "gold":
                System.out.println("- signed ticket stub.");
            case "silver":
                System.out.println("- impersonal photograph");
            case "bronze":
                System.out.println("- my best wishes");
        }

        /* String color = "orange";

        stacking clauses 

        switch (color) {
        case "red":
        case "yellow":
        case "blue":
        System.out.println("primary color");
        break;
        case "green":
        case "purple":
        case "orange":
        System.out.println("secondary color");
        break;
        default:
        System.out.println("regular color");
         */

    }
}
