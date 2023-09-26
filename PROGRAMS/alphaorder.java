import java.util.Arrays;
import java.util.Scanner;

public class alphaorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];
        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.next();
        }
        System.out.print("Enter the sort order (A for ascending, D for descending): ");
        String order = scanner.next();
        if (order.equalsIgnoreCase("A")) {
            Arrays.sort(names);
        } else if (order.equalsIgnoreCase("D")) {
            Arrays.sort(names, (a, b) -> b.compareTo(a));
        } else {
            System.out.println("Invalid sort order");
            return;
        }
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
