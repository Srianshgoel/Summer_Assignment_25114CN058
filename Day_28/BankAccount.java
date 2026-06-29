import java.util.Scanner;

class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int accNo;
        String name;
        double balance;

        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();

        System.out.println("\nAccount Details");
        System.out.println("Account Number: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: ₹" + balance);
    }
}