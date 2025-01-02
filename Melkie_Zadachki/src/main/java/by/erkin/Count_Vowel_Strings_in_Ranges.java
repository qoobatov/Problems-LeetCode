package by.erkin;

public class Count_Vowel_Strings_in_Ranges {

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        String[] words = {"aba", "bcb", "ece", "aa", "e"};
        int[][] ranges = {{0, 2}, {1, 4}, {1, 1}};


        for (int i = 0; i < ranges.length; i++) {
            int start = ranges[i][0];
            int end = ranges[i][1];
            int count = 0;

            for (int k = start; k <= end; k++) {
                String word = words[k];
                if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                    count++;
                }
            }

            System.out.println("Query " + i + ": " + count);
        }



    }
}
