import java.util.Scanner;

public class Q116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] item = new String[10];
        int[] quantity = new int[10];
        int count = 0;

        int choice;

        do {
            System.out.println("\n1. Add Item");
            System.out.println("2. Display Inventory");
            System.out.println("3. Search Item");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    item[count] = sc.nextLine();

                    System.out.print("Enter quantity: ");
                    quantity[count] = sc.nextInt();

                    count++;
                    break;

                case 2:
                    System.out.println("\nInventory:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(item[i] + " : " + quantity[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter item name to search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (item[i].equalsIgnoreCase(search)) {
                            System.out.println("Quantity = " + quantity[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Item not found.");
                    break;
            }

        } while (choice != 4);

        sc.close();
    }
}