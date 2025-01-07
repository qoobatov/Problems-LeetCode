package by.erkin;

public class Roman_to_Integer {
    public int romanToInt(String s) {
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    break;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Roman_to_Integer romanToInteger = new Roman_to_Integer();
        System.out.println(romanToInteger.romanToInt("III"));
    }

}

