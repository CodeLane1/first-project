public class Switch {
    public static void main(String[] args) {
        int place = 2;
        String ribbonColor;

        //1. switch keyword, then an expression (often a variable) in parenthesis, followed by a block
        switch (place) {
            case 1: //2. case keyword, then a literal value, then colon.
                //if the switch's expression resolves to the case's value, all code nested inside the case executes.
                ribbonColor = "blue";
                System.out.println("first place!");
                break; //3. break keyword, immediately exits the switch's block
            case 2:
                ribbonColor = "red";
                System.out.println("second place!");
                break;
            case 3:
                ribbonColor = "white";
                System.out.println("third place!");
                break;
            default:  //4. default keyword, happens when no other case matched
                ribbonColor = "unknown";
        }
        System.out.println(ribbonColor);
    }
}
