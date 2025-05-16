import java.util.Scanner;

public class task4 {
    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите основание (x): ");
        int x = scanner.nextInt();
        System.out.print("Введите степень (y): ");
        int y = scanner.nextInt();
        if (y < 0) {
            System.out.println("Ошибка: число должно быть положительным.");
            return;
        }
        int result = pow(x,y);
        System.out.println("Результат возведение x в степень y: " + result);
    }
}
