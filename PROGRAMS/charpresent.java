import java.util.Scanner;

public class charpresent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        boolean isPresent = sentence.indexOf(ch) != -1;

        if (isPresent) {
            System.out.println("The character " + ch + " is present in the sentence.");
        } else {
            System.out.println("The character " + ch + " is not present in the sentence.");
        }
    }
}