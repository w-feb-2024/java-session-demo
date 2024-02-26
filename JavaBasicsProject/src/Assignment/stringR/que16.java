import java.util.regex.*;

public class que16 {
    public static void main(String[] args) {
        // Problem 16: Replace all vowels in a string with a specified character
        String str16 = "Hello, World!";
        String replacedVowels = str16.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("Problem 16: Replaced vowels: " + replacedVowels);

        // Problem 17: Count the number of decimal places in a given number
        double number17 = 123.456;
        int decimalPlaces = String.valueOf(number17).split("\\.")[1].length();
        System.out.println("Problem 17: Number of decimal places: " + decimalPlaces);

        // Problem 18: Validate a personal identification number (PIN) (assuming length is 4, 6, or 8)
        String pin18 = "12345678";
        boolean isValidPin = pin18.matches("\\d{4}|\\d{6}|\\d{8}");
        System.out.println("Problem 18: Is PIN valid? " + isValidPin);

        // Problem 19: Remove specific letters from a string and return the updated string
        String str19 = "pqrstuvwxy";
        String removedLetters = str19.replaceAll("[pqr]", "");
        System.out.println("Problem 19: Removed specific letters: " + removedLetters);

        // Problem 20: Set thousand separators for a given number
        int number20 = 1234567890;
        String formattedNumber = String.format("%,d", number20);
        System.out.println("Problem 20: Formatted number: " + formattedNumber);

        // Problem 21: Remove all non-alphanumeric characters from a string
        String str21 = "Hello, World! 123#";
        String alphanumericOnly = str21.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Problem 21: Alphanumeric only: " + alphanumericOnly);

        // Problem 22: Validate a phone number
        String phoneNumber22 = "123-456-7890";
        boolean isValidPhoneNumber = phoneNumber22.matches("\\d{3}-\\d{3}-\\d{4}");
        System.out.println("Problem 22: Is phone number valid? " + isValidPhoneNumber);

        // Problem 23: Move all lowercase letters to the front of a given word
        String word23 = "TeStInG";
        String sortedWord = word23.replaceAll("[a-z]", "") + word23.replaceAll("[^a-z]", "");
        System.out.println("Problem 23: Sorted word: " + sortedWord);

        // Problem 24: Separate consonants and vowels from a given string
        String str24 = "Hello, World!";
        String consonants = str24.replaceAll("[aeiouAEIOU\\W\\d]", "");
        String vowels = str24.replaceAll("[^aeiouAEIOU]", "");
        System.out.println("Problem 24: Consonants: " + consonants);
        System.out.println("Problem 24: Vowels: " + vowels);

        // Problem 25: Get the last n vowels of a given string
        String str25 = "Hello, World!";
        int n = 2;
        String[] words = str25.split("\\s");
        String lastNVowels = "";
        for (String word : words) {
            String wordVowels = word.replaceAll("[^aeiouAEIOU]", "");
            if (wordVowels.length() >= n) {
                lastNVowels += wordVowels.substring(wordVowels.length() - n);
            }
        }
        System.out.println("Problem 25: Last " + n + " vowels: " + lastNVowels);

        // Problem 26: Check if a given string is a valid hex code or not
        String hexCode26 = "#1a2b3c";
        boolean isValidHexCode = hexCode26.matches("#[0-9a-fA-F]+");
        System.out.println("Problem 26: Is valid hex code? " + isValidHexCode);

        // Problem 27: Add a dash before and after every vowel in a given string
        String str27 = "Hello, World!";
        String withDashes = str27.replaceAll("([aeiouAEIOU])", "-$1-");
        System.out.println("Problem 27: With dashes: " + withDashes);

        // Problem 28: Reverse words longer than 3 in a given string
        String str28 = "Hello, World! This is a test.";
        String[] words28 = str28.split("\\s");
        StringBuilder reversedStr28 = new StringBuilder();
        for (String word : words28) {
            if (word.length() > 3) {
                word = new StringBuilder(word).reverse().toString();
            }
            reversedStr28.append(word).append(" ");
        }
        System.out.println("Problem 28: Reversed words longer than 3: " + reversedStr28.toString().trim());

        // Problem 29: Check if a given string is a mathematical expression or not
        String expression29 = "3 + 4 * 2";
        boolean isMathExpression = expression29.matches("[\\d\\s\\+\\-\\*\\/\\(\\)]+");
        System.out.println("Problem 29: Is mathematical expression? " + isMathExpression);

        // Problem 30: Insert a dash between an upper case letter and a lower case letter in a string
        String str30 = "HelloWorld";
        String withDashes30 = str30.replaceAll("([a-z])([A-Z])", "$1-$2");
        System.out.println("Problem 30: With dashes: " + withDashes30);
    }
}
