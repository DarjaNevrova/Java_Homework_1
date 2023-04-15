package basic.homeworks;

public class Homework_5 {

    public static void main(String[] args) {

        System.out.println(romanToDecimal("MDIC"));
        System.out.println(romanToDecimal("XIV"));
        System.out.println(romanToDecimal("LCXIV"));

    }

    static int romanToDecimal(String romanNumeral) {
        int result = 0;
        int previousValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int value = charMap(romanNumeral.charAt(i));
            if (previousValue > value) {
                result -= value;
            } else {
                result += value;
            }
            previousValue = value;
        }
        return result;
    }

    static int charMap(char symbol) {
        switch (symbol) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
        }
        return 0;
    }

}
