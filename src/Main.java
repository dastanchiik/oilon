import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        System.out.println("Введите число");
        int numbers = scanner.nextInt();
        System.out.println("Выберите функцию: /     *     -     +");
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
        System.out.println(equal);
    }

    public static void division(int a, int b) {
        int equals = a / b;
        System.out.println(equals);
    }

    public static void plus(int a, int b) {
        int equalss = a + b;
        System.out.println(equalss);
    }

    public static void minus(int a, int b) {
        int equala = a - b;
        System.out.println(equala);
    }
}