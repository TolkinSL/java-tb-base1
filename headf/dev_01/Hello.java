package headf.dev_01;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        int x = 1;
        System.out.println("While Start");
        while (x < 4) {
            System.out.printf("x = %d\n", x);
            x += 1;
        }
        System.out.println("While Stop");
    }
}
