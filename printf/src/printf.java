import java.util.Scanner;


public class printf {
    public static void main(String[] args) {

        //The format string: "%s has %s %s and can jump %s vertically."
        //other arguments replace each '%s' in order
        System.out.printf("%s has %s %s and can jump %s inches vertically.", "Nomi", 3, "dogs", 37.68);

        //say we have double stock price with many digits after the decimal. We can control its display with formatting placeholders.
        double stockPrice = 87.9429495;
        System.out.printf("%s %n", stockPrice); // default string terminated with a newline
        System.out.printf("%f %n", stockPrice); // format as floating point
        System.out.printf("%.2f %n", stockPrice); // floating point with a max of 2 digits after the decimal
        System.out.printf("%05.1f %n", stockPrice); // floating point with 1 digit after the decimal...
                                                    // a minimum of 5 printed characters, padded by 0s

        //we can format data in tables using the left-justify and width modifiers
        //Example: %-20s
        //% : start placeholder
        //- : left justified
        //20 : a minimum of 20 printed characters
        //s : general string format

        String rowFormat = "| %-20s | %-15s | %6s | %n";

        //header
        System.out.println("Beetle Families");
        System.out.println("-".repeat(51));
        System.out.printf(rowFormat, "Common Name", "Latin Name", "Rating");
        System.out.println("-".repeat(51));

        // rows
        System.out.printf(rowFormat, "Carrion Beetles", "Silphidae", 9.7);
        System.out.printf(rowFormat, "Darkling Beetles", "Tenebrionidae", 10.0);
        System.out.printf(rowFormat, "Fireflies", "Lampyridae", 9.98);
        System.out.printf(rowFormat, "Fungus Weevils", "Anthribidae", 9.45);
        System.out.printf(rowFormat, "LadyBugs", "Coccinellidae", 9.62);

        // footer
        System.out.println("-".repeat(51));

    }
}
