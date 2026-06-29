import java.util.Scanner;

public class Q114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n1. Display Array");
            System.out.println("2. Find Maximum");
            System.out.println("3. Find Minimum");
            System.out.println("4. Calculate Sum");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i : arr)
                        System.out.print(i + " ");
                    System.out.println();
                    break;

                case 2:
                    int max = arr[0];
                    for (int i : arr)
                        if (i > max)
                            max = i;
                    System.out.println("Maximum = " + max);
                    break;

                case 3:
                    int min = arr[0];
                    for (int i : arr)
                        if (i < min)
                            min = i;
                    System.out.println("Minimum = " + min);
                    break;

                case 4:
                    int sum = 0;
                    for (int i : arr)
                        sum += i;
                    System.out.println("Sum = " + sum);
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}