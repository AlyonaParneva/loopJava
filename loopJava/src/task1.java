import java.util.Scanner;

public class task1 {
    public static String listNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i);
            if (i != x) {
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
        String result = listNums(x);
        System.out.println("Результат - числа от 0 до введенного: " + result);
    }
}
