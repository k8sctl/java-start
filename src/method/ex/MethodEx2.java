package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        String message = "Hello, World!";

        printMessage(message, 3);
        System.out.println();
        printMessage(message, 5);
        System.out.println();
        printMessage(message, 7);
    }

    public static void printMessage(String msg, int times) {
        for (int i = 0 ; i < times ; i++) {
            System.out.println(msg);
        }
    }
}
