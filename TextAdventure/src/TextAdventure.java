import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {


        System.out.println("Can you become the Hero that you are or will you perish?");

        boolean continueLoop;
        do {

            //current hero
            String location = "Neutral Room";

            //must find these items to become Thor
            boolean hasHammer = false;
            boolean hasLightning = false;

            //receive commands
            Scanner console = new Scanner(System.in);
            String command = null;

            while (!location.equals("done")) {

                switch (location) {
                    case "Valhalla":
                        System.out.println("You made it to Valhalla.");
                        System.out.println("You notice Odin.");
                        System.out.println("Odin says there is a hammer and a bottle of lightning hidden somewhere in the land that you must find and then enter the Secret room!");
                        System.out.println("There is a mountain to the north.");
                        System.out.println("There is a volcano to the south.");
                        System.out.println("There is a secret room to the east");
                        System.out.println("There is a \"Questionable Door\"");
                        command = console.nextLine();
                        if (command.equalsIgnoreCase("north")) {
                            location = "Mountain";
                        } else if (command.equalsIgnoreCase("south")) {
                            location = "Volcano";
                        } else if (command.equalsIgnoreCase("east")) {
                            location = "Secret-Room";
                        } else if (command.equalsIgnoreCase("Questionable Door")) {
                            location = "Questionable Door";
                        } else {
                            System.out.println("The only options are: North or South.");
                        }

                        break;
                    case "Mountain":
                        System.out.println("You made it to the Mountain.");
                        System.out.println("You notice a cave entrance in the Mountain.");
                        if (!hasHammer) {
                            System.out.println("You find a mighty hammer within.");
                        }
                        System.out.println("Will you \"take\" the hammer or \"leave\" and return to Valhalla?");
                        command = console.nextLine();
                        if (command.equalsIgnoreCase("leave")) {
                            location = "Valhalla";
                        } else if (command.equalsIgnoreCase("take")) {
                            hasHammer = true;
                            System.out.println("You took the Hammer");
                            location = "Valhalla";
                        } else {
                            System.out.println("You must choose to either leave or take the hammer.");
                        }
                        break;
                    case "Volcano":
                        System.out.println("You made it to the Volcano.");
                        System.out.println("You notice something deep inside the Volcano only a God could reach.");
                        if (!hasLightning) {
                            System.out.println("You notice a bottle of lightning sitting in the core of the Volcano.");
                        }
                        System.out.println("Will you \"take\" the bottle of lightning or \"leave\" and return to Valhalla?");
                        command = console.nextLine();
                        if (command.equalsIgnoreCase("leave")) {
                            location = "Valhalla";
                        } else if (command.equalsIgnoreCase("take")) {
                            System.out.println("You took the Lightning");
                            hasLightning = true;
                            location = "Valhalla";

                        } else {
                            System.out.println("You must choose to either leave or take the hammer.");
                        }
                        break;
                    case "Secret-Room":
                        System.out.println("A wild Loki appeared!");
                        if (hasHammer && hasLightning) {
                            System.out.println("You can beat Loki with the Hammer and Lightning!");
                            System.out.println("You slayed Loki!");
                            System.out.println("For now...");
                        } else {
                            System.out.println("You are missing the: ");
                            if (!hasHammer) {
                                System.out.println("Hammer");
                                location = "Valhalla";
                            }
                            if (!hasLightning) {
                                System.out.println("Lightning");

                            }
                            System.out.println("Loki stabs you in the back!!");
                            System.out.println("You're aliven't");

                        }
                        location = "done";
                        break;

                    case "Questionable Door":
                        if (!hasHammer && !hasLightning) {
                            System.out.println("You are try this door with nothing?");
                            System.out.println("A mysterious force ends your life");
                            location = "done";
                        } else {
                            System.out.println("I'll be taking that!");
                            if (hasHammer) {
                                hasHammer = false;
                                location = "Valhalla";
                            }
                            if (hasLightning) {
                                hasLightning = false;
                                location = "Valhalla";
                            }
                        }
                        break;



                    default:
                        location = "Valhalla";

                }
            }

            System.out.println("Do you want to play again? [y/n]: ");
            String newInput = console.nextLine();
            continueLoop = newInput.equalsIgnoreCase("y");

        }while(continueLoop) ;
        


    }
}
