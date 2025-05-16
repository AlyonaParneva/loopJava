import java.util.Scanner;

public class task6 {
    public static boolean equalNum(int x) {
        int lastDigit = x % 10;
        x /= 10;
        while (x > 0) {
            int currentDigit = x % 10;
            if (currentDigit != lastDigit) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println("Ошибка: число должно быть положительным.");
            return;
        }
        boolean result = equalNum(x);
        System.out.println("Результат - числа одинаковы: " + result);
    }
}
