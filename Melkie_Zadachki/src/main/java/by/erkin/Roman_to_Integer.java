package by.erkin;

public class Roman_to_Integer {
    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentValue = getValue(s.charAt(i));
            // Если текущая цифра меньше следующей, вычитаем её, иначе добавляем
            if (i + 1 < s.length() && currentValue < getValue(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    private int getValue(char roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman numeral");
        }
    }

    public static void main(String[] args) {
        Roman_to_Integer romanToInteger = new Roman_to_Integer();
        System.out.println(romanToInteger.romanToInt("III"));   // 3
        System.out.println(romanToInteger.romanToInt("IV"));    // 4
        System.out.println(romanToInteger.romanToInt("IX"));    // 9
        System.out.println(romanToInteger.romanToInt("LVIII")); // 58
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));// 1994
    }
}
