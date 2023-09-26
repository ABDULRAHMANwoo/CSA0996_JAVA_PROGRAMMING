import java.util.Scanner;
public class username {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a username:");
        String username = myObj.nextLine();
        String regex = "^[a-zA-Z0-9_]{6,30}$";
        if (username.matches(regex)) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }
}
