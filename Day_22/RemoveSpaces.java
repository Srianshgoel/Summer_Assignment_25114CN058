import java.util.Scanner;

class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.replace(" ", "");

        System.out.println("After removing spaces: " + result);
    }
}