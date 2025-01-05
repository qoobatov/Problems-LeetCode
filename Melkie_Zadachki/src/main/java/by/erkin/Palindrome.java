package by.erkin;

import java.util.ArrayList;
import java.util.Objects;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        ArrayList<Integer> array = new ArrayList<Integer>();
        do {
            array.add(x % 10);
            x /= 10;
        } while (x > 0);

        for (int i = 0; i < array.size() / 2; i++) {
            if (!Objects.equals(array.get(i), array.get(array.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(125));

    }
}
