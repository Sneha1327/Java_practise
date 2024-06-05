package day26.StringClass.Assignment;

public class ReverseStringWithSpace {

    public static String reverseString(String str) {
        StringBuilder result = new StringBuilder();
        int j = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result.append(' ');
            } else {
                while (j >= 0 && str.charAt(j) == ' ') {
                    j--; // Skip trailing spaces
                }
                result.append(str.charAt(j--));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Hello, world! How are you?";
        String reversed = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
       System.out.println(reverseString("I am not String"));
    }
}
