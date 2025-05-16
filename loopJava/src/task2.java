import java.util.Scanner;

public class task2 {
    public static String reverseListNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            result.append(i);
            if (i != 0) {
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
        String result = reverseListNums(x);
        System.out.println("Результат - числа от введенного до 0: " + result);
    }
}
