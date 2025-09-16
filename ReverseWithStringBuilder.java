public class ReverseWithStringBuilder {
    public static void main(String[] args) {
        String str = "OpenAI";
        StringBuilder sb = new StringBuilder(str);

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + sb.reverse());
    }
}