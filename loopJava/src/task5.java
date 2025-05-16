import java.util.Scanner;

public class task5 {
    public static int numLen(long x) {
        if (x == 0) return 1;
        int length = 0;
        while (x > 0) {
            x = x / 10;
            length++;
        }
        return length;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println("Ошибка: число должно быть положительным.");
            return;
        }
        int result = numLen(x);
        System.out.println("Результат - количество знаков в числе x.x : " + result);
    }
}
