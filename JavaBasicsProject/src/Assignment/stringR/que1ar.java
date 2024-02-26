import java.util.regex.*;

public class que1ar{
    public static void main(String[] args) {
        // Problem 1: Check whether a string contains only a certain set of characters (a-z, A-Z, and 0-9)
        String str1 = "AbCdEf1234";
        boolean containsOnlyCertainCharacters = str1.matches("[a-zA-Z0-9]+");
        System.out.println("Problem 1: Contains only certain characters? " + containsOnlyCertainCharacters);

        // Problem 2: Match a string that has a p followed by zero or more q's
        String str2 = "pq";
        boolean matchesPFollowedByQs = str2.matches("pq*");
        System.out.println("Problem 2: Matches p followed by zero or more q's? " + matchesPFollowedByQs);

        // Problem 3: Find sequences of lowercase letters joined by an underscore
        String str3 = "abc_def_ghi";
        Pattern pattern3 = Pattern.compile("[a-z]+(_[a-z]+)+");
        Matcher matcher3 = pattern3.matcher(str3);
        System.out.println("Problem 3: Sequences of lowercase letters joined by underscore:");
        while (matcher3.find()) {
            System.out.println(matcher3.group());
        }

        // Problem 4: Find the sequence of one uppercase letter followed by lowercase letters
        String str4 = "AaBbCc";
        Pattern pattern4 = Pattern.compile("[A-Z][a-z]+");
        Matcher matcher4 = pattern4.matcher(str4);
        System.out.println("Problem 4: Sequence of one uppercase letter followed by lowercase letters:");
        while (matcher4.find()) {
            System.out.println(matcher4.group());
        }

        // Problem 5: Match a string with 'p' followed by anything ending in 'q'
        String str5 = "ptestingq";
        boolean matchesPFollowedByAnythingEndingInQ = str5.matches("p.*q$");
        System.out.println("Problem 5: Matches 'p' followed by anything ending in 'q'? " + matchesPFollowedByAnythingEndingInQ);

        // Problem 6: Check if a word contains the character 'g' in a given string
        String str6 = "programming";
        boolean containsG = str6.contains("g");
        System.out.println("Problem 6: Contains 'g'? " + containsG);

        // Problem 7: Match a word containing 'g', not at the start or end of the word
        String str7 = "testing";
        boolean matchesWordWithGNotAtStartOrEnd = str7.matches("\\b[^g]+g[^g]+\\b");
        System.out.println("Problem 7: Matches word containing 'g', not at start or end? " + matchesWordWithGNotAtStartOrEnd);

        // Problem 8: Match a string containing only upper and lowercase letters, numbers, and underscores
        String str8 = "Abc_123";
        boolean matchesAlphanumericUnderscore = str8.matches("[a-zA-Z0-9_]+");
        System.out.println("Problem 8: Matches alphanumeric and underscore? " + matchesAlphanumericUnderscore);

        // Problem 9: Check if a string starts with a specific number
        String str9 = "123testing";
        boolean startsWithNumber = str9.matches("^\\d.*");
        System.out.println("Problem 9: Starts with a number? " + startsWithNumber);

        // Problem 10: Remove leading zeros from a given IP address
        String ipAddress = "192.168.001.001";
        String[] ipParts = ipAddress.split("\\.");
        StringBuilder normalizedIpAddress = new StringBuilder();
        for (String part : ipParts) {
            normalizedIpAddress.append(Integer.parseInt(part)).append(".");
        }
        normalizedIpAddress.setLength(normalizedIpAddress.length() - 1); // Remove trailing dot
        System.out.println("Problem 10: Normalized IP address: " + normalizedIpAddress);

        // Problem 11: Check for a number at the end of a string
        String str11 = "abc123";
        boolean endsWithNumber = str11.matches(".*\\d$");
        System.out.println("Problem 11: Ends with a number? " + endsWithNumber);

        // Problem 12: Replace Python with Java and code with coding in a given string
        String str12 = "Python is a great language for coding.";
        String replacedStr12 = str12.replaceAll("Python", "Java").replaceAll("code", "coding");
        System.out.println("Problem 12: Replaced string: " + replacedStr12);

        // Problem 13: Find the word Python in a given string. If found, return Java; otherwise, return C++
        String str13 = "I prefer Python over Java.";
        String result13 = str13.contains("Python") ? "Java" : "C++";
        System.out.println("Problem 13: Result: " + result13);

        // Problem 14: Count the number of vowels in a given string using a regular expression
        String str14 = "Hello, World!";
        int vowelCount = str14.replaceAll("[^aeiouAEIOU]", "").length();
        System.out.println("Problem 14: Number of vowels: " + vowelCount);

        // Problem 15: Remove all vowels from a given string
        String str15 = "Hello, World!";
        String withoutVowels = str15.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Problem 15: Without vowels: " + withoutVowels);
    }
}
