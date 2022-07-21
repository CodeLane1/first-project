public class method {
    /*

    public static String getRandomColor() {

        switch ((int) (Math.random() * 5)) {
            case 0:
                return "Red";
            case 1:
                return "Blue";
            case 2:
                return "Green";
            case 3:
                return "Orange";
        }
        return "";
    }

    public static void main(String[] args) {
        String randomColor = getRandomColor();
        System.out.println(randomColor);
    }

     */
    public static int maximum(int a, int b, int c) {
        int max = Math.max(a, b);
        return Math.max(max, c);
    }
    public static int maximum(int a, int b, int c, int d) {
        int max = maximum(a, b ,c);
        return Math.max(max, d);
    }



    public static void main(String[] args) {
        int result = maximum(1, 2, 3, 4);
        System.out.println(maximum(4, 5, 10, 4));
        System.out.println(result);
    }

}



