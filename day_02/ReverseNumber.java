import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, reverse = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num != 0) {
            reverse = reverse * 10 + (num % 10);
            num /= 10;
        }

        System.out.println("Reversed Number = " + reverse);
    }
}