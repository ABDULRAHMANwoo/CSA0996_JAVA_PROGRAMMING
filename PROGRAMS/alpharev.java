import java.util.Scanner;

public class alpharev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Remove all non-letter characters from the string
        str = str.replaceAll("[^a-zA-Z]", "");

        // Convert the string to lowercase
        str = str.toLowerCase();

        // Convert the string to a character array
        char[] arr = str.toCharArray();

        // Sort the character array in reverse order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Convert the character array back to a string
        String reversed = new String(arr);

        System.out.println("Reversed alphabet: " + reversed);
    }
}