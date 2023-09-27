import java.util.Scanner;

public class pattern19
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows needed in the pattern ");

        int rows = scanner.nextInt();

        System.out.println("** Printing the pattern... **");

        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print("1 ");
            }
            for (int k = rows-1; k >= i; k--)
            {
                System.out.print("1 ");
            }
            System.out.println();
        }
        for (int i = 2; i <= rows; i++)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print("1 ");
            }
            for (int k = rows-1; k >= i; k--)
            {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}