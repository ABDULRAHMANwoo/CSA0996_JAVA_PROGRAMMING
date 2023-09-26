import java.util.Scanner;
public class Strtoint {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = myObj.nextLine();
        int inputInt = Integer.parseInt(inputString);
        System.out.println("Input integer is: " + inputInt);
    }
}