import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numbers = scanner.nextInt();
        String plusOrMinus = scanner.next();
        switch (plusOrMinus) {
            case "/":
                division(number, numbers);
                break;
            case "*":
                multiply(number, numbers);
                break;
            case "+":
                plus(number, numbers);
                break;
            case "-":
                minus(number, numbers);
                break;
        }
    }

    public static void multiply(int a, int b) {
        int equal = a * b;
    }

    public static void division(int a, int b) {
        int equals = a / b;
    }

    public static void plus(int a, int b) {
        int equalss = a + b;
    }

    public static void minus(int a, int b) {
        int equala = a - b;
    }
}