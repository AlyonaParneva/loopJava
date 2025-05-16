import java.util.Scanner;

public class task9 {
    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int space = 0; space < x - i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту треугольника > 0: ");
        int x = scanner.nextInt();
        if (x <= 0) {
            System.out.println("Ошибка: число должно быть положительным.");
            return;
        }
        rightTriangle(x);
    }
}
