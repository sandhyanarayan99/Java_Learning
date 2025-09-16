public class PalindromeWithStringBuilder {
    public static void main(String[] args) {
        String str = "madam";
        StringBuilder sb = new StringBuilder(str);

        if (str.equals(sb.reverse().toString())) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is NOT a palindrome.");
        }
    }
}