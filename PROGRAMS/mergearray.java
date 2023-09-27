import java.util.ArrayList;

public class mergearray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        ArrayList<Integer> mergedList = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedList.add(arr1[i]);
                i++;
            } else {
                mergedList.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            mergedList.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            mergedList.add(arr2[j]);
            j++;
        }

        System.out.println("Merged List: " + mergedList);
    }
}
