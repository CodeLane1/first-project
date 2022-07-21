public class Variables02 {
    public static void main(String[] args) {
        int tacos = 12;
        int burgers = 10;
        int total = tacos + burgers;

        System.out.println(total);

        tacos = 20;

        System.out.println(total);
        System.out.println(tacos);

        total = tacos + burgers;
        System.out.println(total);
    }
}
