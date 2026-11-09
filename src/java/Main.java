public class Main {
    public static void main(String[] args) {

        System.out.println("Это добавлено в ветке main");
        System.out.println(add(1, 2));
        System.out.println("Hello World!");
        System.out.println(sub(2, 1));
        System.out.println("Goodbye!");
        System.out.println("Last change");

        System.out.println("Welcome!");
        System.out.println("Это добавлено в ветке dev");
        System.out.println(add(5,5));
        System.out.println("Hello dev!");
        System.out.println(sub(10,1));

    }

    private static int add(int x, int y) {
        return x + y;
    }

    private static int sub(int x, int y) {
        return x - y;
    }
}
