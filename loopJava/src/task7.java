import java.util.Scanner;

public class task7 {
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадрата > 0: ");
        int x = scanner.nextInt();
        if (x <= 0) {
            System.out.println("Ошибка: число должно быть положительным.");
            return;
        }
        square(x);
    }
}
