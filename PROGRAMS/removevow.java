import java.util.Scanner;

public class removevow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Print the original string
        System.out.println("Original string: " + str);

        // Remove all vowels from the string
        str = str.replaceAll("[aeiouAEIOU]", "");

        // Print the string without vowels
        System.out.println("String without vowels: " + str);
    }
}