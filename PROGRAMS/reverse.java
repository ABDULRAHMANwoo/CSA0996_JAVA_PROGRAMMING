import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = myObj.nextLine();
        String reversedString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);
        }
        System.out.println("Reversed string is: " + reversedString);
    }
}