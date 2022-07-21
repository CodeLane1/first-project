public class FormatStringsElsewhere {
    public static void main(String[] args) {
        String firstName = "Husein";
        String lastName = "Vaan";

        //full name becomes "Husein Vaan"
        String fullName = String.format("%s %s", firstName, lastName);

        System.out.println(fullName);

        //title becomes "Name: Husein Vaan, Occupation: Game Developer"
        String title = String.format("Name: %s, Occupation: %s", fullName, "Game Developer");

        System.out.println(title);



    }
}
