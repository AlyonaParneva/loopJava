import java.util.Scanner;

public class task3 {
    public static String chet(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i);
            if (i + 2 <= x) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println("Ошибка: число должно быть положительным.");
            return;
        }
        String result = chet(x);
        System.out.println("Результат - четные числа от 0 до введенного: " + result);
    }
}
