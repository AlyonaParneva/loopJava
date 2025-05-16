import java.util.Scanner;

public class task8 {
    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
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
        leftTriangle(x);
    }
}
