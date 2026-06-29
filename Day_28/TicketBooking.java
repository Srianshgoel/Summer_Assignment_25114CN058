import java.util.Scanner;

class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int seats;

        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();

        System.out.print("Enter Number of Seats: ");
        seats = sc.nextInt();

        int price = seats * 500;

        System.out.println("\nTicket Details");
        System.out.println("Customer Name: " + name);
        System.out.println("Seats Booked: " + seats);
        System.out.println("Total Amount: ₹" + price);
    }
}