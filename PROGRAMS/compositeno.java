import java.util.ArrayList;

public class compositeno {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayList<Integer> compositeList = new ArrayList<>();

        int product = 1;

        for (int i : arr) {
            if (isComposite(i)) {
                compositeList.add(i);
                product *= i;
            }
        }

        System.out.println("Composite Numbers: " + compositeList);
        System.out.println("Product of Composite Numbers: " + product);
    }

    public static boolean isComposite(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
}
