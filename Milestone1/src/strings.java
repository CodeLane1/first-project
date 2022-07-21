public class strings {
    public static void main(String[] args) {
        String gluedMessage = "school buses are kind of " + "orange";
        System.out.println(gluedMessage);

        String redAndBlue = "red, blue, ";
        String primaryColors = redAndBlue + "yellow";
        System.out.println(primaryColors);

        String name1 = "Fifine";
        String name2 = "Bendex";
        String adjective1 = "hopeful";
        String adjective2 = "churlish";
        System.out.println(name1 + " is " + adjective2);
        System.out.println(name2 + " is " + adjective1);
        System.out.println(name1 + " will be " + adjective1 + " soon");

        int dozen = 12;
        boolean likesWalks = true;
        double n = -9.75;

        String message = dozen + " is my favorite number.";
        System.out.println(message);

        message = "Do you feel like a walk? " + likesWalks;
        System.out.println(message);

        message = "The retail value is $" + n + ".";
        System.out.println(message);



    }
}