import java.util.Scanner;

class ContactManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        String phone;

        System.out.print("Enter Contact Name: ");
        name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();

        System.out.println("\nContact Details");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phone);
    }
}