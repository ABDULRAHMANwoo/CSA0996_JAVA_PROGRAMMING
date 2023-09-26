import java.util.Scanner;

public class splchar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int specialCount = 0;
        System.out.print("Special characters: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.print(ch + " ");
                specialCount++;
            }
        }
        System.out.println("\nNumber of special characters: " + specialCount);
    }
}
