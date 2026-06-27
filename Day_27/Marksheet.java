import java.util.Scanner;

class Marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks of Subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int s3 = sc.nextInt();

        int total = s1 + s2 + s3;
        double percentage = total / 3.0;

        System.out.println("\nMarksheet");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 90)
            System.out.println("Grade: A");
        else if (percentage >= 75)
            System.out.println("Grade: B");
        else if (percentage >= 60)
            System.out.println("Grade: C");
        else if (percentage >= 40)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }
}