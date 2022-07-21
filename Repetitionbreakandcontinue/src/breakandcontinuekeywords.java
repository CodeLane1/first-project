

public class breakandcontinuekeywords {
    public static void main(String[] args) {

        /*break
        for (int i = 0; i < 10000; i++) {
            System.out.println("First line in the block: " + i);

            // a 10% chance to break out of the loop
            if (Math.random() > 0.9) {
                System.out.println("breaking!");
                break; // exit the for's code block immediately
            }

            System.out.println("Last line in the block: " + i);
        }

         */

        /* print all even numbers under 100
        int n = 0;
        while (n < 100) {

            if (n % 2 == 1) {
                n++;
                continue; // skip remaining code, but continue looping
            }

            System.out.println(n);
            n++;
        }

// print 20% of the numbers under 100, randomly
        for (n = 0; n < 100; n++) {

            if (Math.random() < 0.80) {
                continue; // skip remaining code, but continue looping
            }

            System.out.print("lucky number: ");
            System.out.println(n);
        }

         */

        //A break or continue inside a nested loop only affects the nearest code block. It never controls the outer loop
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                if (column == 3) {
                    break; // the column loops stops entirely, but not the row loop
                }
                System.out.printf("row: %s, column: %s%n", row, column);
            }
        }

    }
}
