import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        int n;
        do {
            System.out.print("Введите натуральное число N (N >= 1): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели некорректное значение. Введите натуральное число N.");
                System.out.print("Введите натуральное число N (N >= 1): ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n < 1);

        for (int i = 0; i < n; i++) {
            System.out.println(inputString);
        }

        scanner.close();
    }
}