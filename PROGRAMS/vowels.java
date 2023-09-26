import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String statement = scanner.nextLine();
        String vowelsOnly = statement.replaceAll("[^aeiouAEIOU]", "");
        int vowelCount = vowelsOnly.length();
        System.out.println("Number of vowels: " + vowelCount);
    }
}
