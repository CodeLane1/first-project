public class Overload {

    //define
    //overloaded
    //signature: createFullName(String, String)
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    //define
    //overloaded
    //signature: createFullName(String, String, String)
    public static String createFullName(String title, String firstName, String lastName) {
        //We can call the 2 argument version of createFullName
        //to re-use the logic.
        return title + " " + createFullName(firstName, lastName);
    }

    //use
    public static void main(String[] args) {
        //pass 2 arguments
        String fullName = createFullName("Powell", "Tatters");
        System.out.println(fullName);

        String title = "Professor";
        String firstName = "Leisha";
        String lastName = "Yendle";

        //pass 3 arguments
        fullName = createFullName(title, firstName, lastName);
        System.out.println(fullName);

        //pass 3 arguments
        System.out.println(createFullName("Senator", "Ly", "De Lasci"));
    }


}
