public class Main {
    public static void main(String[] args) {
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
