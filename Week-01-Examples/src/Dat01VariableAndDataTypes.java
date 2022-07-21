public class Dat01VariableAndDataTypes {

    public static void main(String[] args) { //step 1 use main then press tab
        //variables
        //holds a value

        // declaration [type] [name]

        int dogCount; //10

        //assignment
        // = assignment operator
        dogCount = 10;

        //variables can be assigned immediately after being declared
        int catCount = 5;

        int totalPets = dogCount + catCount;
        System.out.println("Dogs: " + dogCount + "\nCats: " + catCount + "\nTotal pets: " + totalPets); //another way
        System.out.println("Dogs: " + dogCount);
        System.out.println("Cats: " + catCount);
        System.out.println("Total pets: " + totalPets);

        //data types
        //numeric types
        //numeric types
        //int-90% - 32 bits
        //long-10% - 64 bits
        //short - 16 bits
        //byte - 8 bits
        short dogCountS = (short) dogCount; //cast narrowing conversion
        dogCount = dogCountS; //widening conversion

        long starsInMilkyWay = 100000000000L;

        byte maxByte = Byte.MAX_VALUE; //Byte.MIN_VALUE also works for min value
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.println(maxByte);
        System.out.println(maxShort);
        System.out.println(maxInt);
        System.out.println(maxLong);


        //floating point
        //double - 99% - 64 bits
        //float - 32  bits
        double pi = 3.1416;
        float piF = 3.1416f;
        System.out.println(pi);

        //arithmetic
        // + : adds
        // - : subtract
        // * :multiply
        // / :divide
        System.out.println(dogCount / catCount);  //if you divided 10/4 you would get 2
        System.out.println((double)dogCount / catCount);
        double total = (double)dogCount / catCount;
        double someNumber = 1.0 * 50 / 100 - 6;
        //these are expressions because they produce a value
        //play around with dividing and adding (double)

        // weird floating point thing
        System.out.println(12.19 + 0.11); //expect 12.30 but get 12.299999999999999 bc storing decimals in computers is hard

        // % : module (remainder)
        System.out.println(dogCount % catCount); //10 % 4) ==2

        System.out.println(catCount);
        catCount--;
        System.out.println(catCount);

        System.out.println(dogCount);
        // dogCount = dogCount + 7;
        dogCount += 7;
        System.out.println(dogCount);


        //boolean operators
        // boolean value : true or false
        boolean hasMoreCatsThanDogs = true;  //orange because they are keywords
        boolean hasMoreDogsThanCats = false;
        System.out.println(hasMoreCatsThanDogs);
        System.out.println(hasMoreDogsThanCats);
        // boolean operators - evaluate two boolean statements together

        // and - && both have to be true
        // or - || (pipes) only one has to be true
        System.out.println(hasMoreCatsThanDogs && hasMoreDogsThanCats); //false
        System.out.println(hasMoreCatsThanDogs || hasMoreDogsThanCats); //true
        System.out.println(hasMoreCatsThanDogs == hasMoreDogsThanCats); //false
        // not - ! --reverses the boolean
        System.out.println(hasMoreCatsThanDogs);
        System.out.println(!hasMoreCatsThanDogs);
        // !(12 > 13) changes this from false to true
        System.out.println(!(12 > 13) && hasMoreCatsThanDogs); //true

        //comparison operators
        //less than <
        System.out.println(catCount < dogCount);
        //greater than >
        System.out.println(catCount > dogCount);
        //less than or equal to <=
        System.out.println(catCount <= dogCount);
        //greater than or equal to >=
        System.out.println(catCount >= dogCount);
        // equals - == they have to be the same as each other (technically a comparison)
        System.out.println(catCount == dogCount);


        //strings
        char myChar = 'a'; //single bit character or number using single quotes
        // reference type
       String myString = "ab"; //double quotes used for string
        //with reference types we don't use the double equal sign
        // System.out.println(myString == String("ab"));
        System.out.println(myString.equals(new String("ab"))); //always use equals method to check two reference types against each other// }

        System.out.println(myString + 12); //ab12 this will concatenate
        System.out.println((char)(myChar + 12)); //this will add them together
        char a = 'a';
        System.out.println(++a); //doing increment before the variable will increment first then print
        System.out.println(a++); //doing increment after will print the variable and then increment it
        System.out.println(a++);
        System.out.println(++a);
}


    }

