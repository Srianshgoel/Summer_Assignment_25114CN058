import java.util.Scanner;

class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1. Java is a?");
        System.out.println("1. Language");
        System.out.println("2. Operating System");
        System.out.print("Answer: ");
        int ans1 = sc.nextInt();

        if (ans1 == 1)
            score++;

        System.out.println("\nQ2. 2 + 3 = ?");
        System.out.println("1. 4");
        System.out.println("2. 5");
        System.out.print("Answer: ");
        int ans2 = sc.nextInt();

        if (ans2 == 2)
            score++;

        System.out.println("\nQ3. JVM stands for?");
        System.out.println("1. Java Virtual Machine");
        System.out.println("2. Java Variable Method");
        System.out.print("Answer: ");
        int ans3 = sc.nextInt();

        if (ans3 == 1)
            score++;

        System.out.println("\nYour Score = " + score + "/3");
    }
}