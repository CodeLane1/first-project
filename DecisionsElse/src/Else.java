public class Else {
    public static void main(String[] args) {
        boolean canFly = true;
        boolean hasFeathers = false;

        if (canFly && hasFeathers) ;
        {

            System.out.println("likely a bird");


        } else{

            System.out.println("may still fly or have feathers, but not both");

            if (canFly) {
                System.out.println("a rocket?");
                System.out.println("time?");
            } else {  //has feathers
                System.out.println("an ostrich?");
                System.out.println("galoshes?");
            }
            if (hasFeathers) {
                System.out.println("a penguin?");
                System.out.println("a boa?");
            }
        }
    }
}