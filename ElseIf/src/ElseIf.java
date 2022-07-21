public class ElseIf {
    public static void main(String[] args) {
        double packageWeight = 55;

        if (packageWeight > 100.0) { // check first condition
            System.out.println("too big for standard shipping");
        } else if (packageWeight < 1.0) { //check second condition
            System.out.println("too small. send a letter");
        } else {  //the `else` clause executes if all other conditions are false
            System.out.println("can ship");
        }

    }
}

/*if (color.equals("red")) {
    System.out.println("red's compliment is green");
} else if (color.equals("blue")) {
    System.out.println("blue's compliment is orange");
} else if (color.equals("yellow")) {
    System.out.println("yellow's compliment is purple");
} else if (color.equals("green")) {
    System.out.println("green's compliment is red");
} else if (color.equals("orange")) {
    System.out.println("orange's compliment is blue");
} else if (color.equals("purple")) {
    System.out.println("purple's compliment is yellow");
} else {
    System.out.println("I don't know that color");
} */