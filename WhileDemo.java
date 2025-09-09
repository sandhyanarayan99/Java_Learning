import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        do {
            System.out.print("Enter a number (0 to exit): ");
            number = sc.nextInt();
            System.out.println("You entered: " + number);
        } while (number != 0);

        System.out.println("Loop ended.");
    }
}