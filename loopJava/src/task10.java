import java.util.Scanner;

public class task10 {
    public static void guessGame() {
        int randomNum = 5;
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        int x;
        do {
            System.out.print("What number am I thinking (0 to 9)? : ");
            x = sc.nextInt();
            attempts++;
            if (x != randomNum) {
                System.out.println("No, try again");
            }
        } while (x != randomNum);
        System.out.println("Yes, it's " + randomNum);
        System.out.println("Attempts: " + attempts);
    }

    public static void run() {
        guessGame();
    }
}
