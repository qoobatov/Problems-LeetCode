package by.erkin;

import java.util.Arrays;
import java.util.HashSet;

public class Count_Vowel_Strings_in_Ranges {


    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        HashSet<Character> vowels = new HashSet<>(
                Arrays.asList('a', 'e', 'i', 'o', 'u')
        );
        int[] prefixSum = new int[words.length];
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (
                    vowels.contains(currentWord.charAt(0)) &&
                            vowels.contains(currentWord.charAt(currentWord.length() - 1))
            ) {
                sum++;
            }
            prefixSum[i] = sum;
        }
        for (int i = 0; i < queries.length; i++) {
            int[] currentQuery = queries[i];
            ans[i] = prefixSum[currentQuery[1]] - (currentQuery[0] == 0 ? 0 : prefixSum[currentQuery[0] - 1]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Count_Vowel_Strings_in_Ranges a = new Count_Vowel_Strings_in_Ranges();
        String[] words = {"aba", "bcb", "ece", "aa", "e"};
        int[][] queries = {{0, 2}, {1, 4}, {1, 1}};
        a.vowelStrings(words, queries);
    }
}
