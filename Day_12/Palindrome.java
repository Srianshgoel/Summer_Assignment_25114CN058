class Palindrome {
    static boolean isPalindrome(int n) {
        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {
        int n = 121;

        if (isPalindrome(n))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}