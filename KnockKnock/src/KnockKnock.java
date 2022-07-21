import java.util.Scanner;

public class KnockKnock {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);


        System.out.println("Knock Knock");
        String whosethere = console.nextLine();

                if (whosethere.equals("Who's there?")) {
                System.out.println("Interrupting Pirate");
        } else {
                    System.out.println("Interrupting Pirate who?");
                    String interruptingPirateWho = console.nextLine();

                    if (interruptingPirateWho.equals("interruptingPirateWho")) {
                        System.out.println("Argghhh");
                    }

                }






        String enter1 = console.nextLine();
        System.out.println();

        System.out.println("Arrrggghhhh");



    }
}
