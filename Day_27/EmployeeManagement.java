import java.util.Scanner;

class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empId;
        String empName;
        double salary;

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();

        System.out.println("\nEmployee Details");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}