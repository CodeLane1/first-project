

public class InputOutput {

    //Define the method
    //Always use the public static for now.

    public static String createHello(String value) {
        //The expression after the `return` keyword is the output.
        //Its type must match the declared output type.
        return "Hello, " + value;
    }

    //USING the method

    public static void main(String[] args) {
        String name = "Guillermo";
        //An argument can be a variable.
        //Output can be stored in a variable.
        String message = createHello("Avivah");
        System.out.println(message); //Hello, Avivah

        String honorary = "Dr. ";
        //An argument can be any expression of the correct data type.
        //Output can be used immediately as input to another method.
        //Here, it's used as an input for the `println` method.
        System.out.println(createHello(honorary + "Itch"));  //Hello, Dr. Itch
    }





}
