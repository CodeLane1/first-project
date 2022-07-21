import java.util.Scanner; //import the scanner before class to call on Scanner in the future. Makes Scanner more simple to type

public class Console {
    public static void main(String[] args) {
         Scanner console = new Scanner(System.in); //1

        System.out.println("Enter your name:");
        String name = console.nextLine();            //2
        System.out.println("Your name is: " + name);









    }
}
