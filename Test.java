@FunctionalInterface
interface NumberCheck {
    String check(int num);
}

@FunctionalInterface
interface DoubleOperator {
    String compute(double num);
}

@FunctionalInterface
interface StringConcat {
    String join(String str1, String str2);
}

@FunctionalInterface
interface StringLength {
    String length(String str);
}

@FunctionalInterface
interface PalindromeCheck {
    String isPalindrome(String str);
}

public class Test {
    public static void main(String[] args) {

        NumberCheck isEven = num -> 
            num + (num % 2 == 0 ? " is an even number." : " is an odd number.");

        DoubleOperator squareRoot = num -> 
            "The square root of " + num + " is " + Math.sqrt(num) + ".";

        StringConcat concat = (s1, s2) -> 
            "Concatenated result: \"" + s1 + s2 + "\"";

        StringLength countChars = str -> 
            "\"" + str + "\" contains " + str.length() + " characters.";

        PalindromeCheck isPalindrome = str -> {
            String cleaned = str.replaceAll("\\s+", "").toLowerCase();
            boolean palindrome = cleaned.equals(new StringBuilder(cleaned).reverse().toString());
            return "\"" + str + "\" is " + (palindrome ? "" : "not ") + "a palindrome.";
        };

        System.out.println(isEven.check(11));
        System.out.println(squareRoot.compute(25));
        System.out.println(concat.join("Hello, ", "World!"));
        System.out.println(countChars.length("OpenAI"));
        System.out.println(isPalindrome.isPalindrome("madam"));
        System.out.println(isPalindrome.isPalindrome("hello"));
    }
}
