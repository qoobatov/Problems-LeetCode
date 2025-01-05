package by.erkin;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reverse = 0;
        int original = x;

        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(125));

    }
}
