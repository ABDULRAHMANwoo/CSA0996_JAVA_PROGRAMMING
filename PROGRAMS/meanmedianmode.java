import java.util.*;

public class meanmedianmode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 6, 6, 7, 8, 9};

        double mean = 0;
        double median = 0;
        int mode = 0;
        int maxCount = 0;

        for (int i : arr) {
            mean += i;
        }
        mean /= arr.length;

        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            median = (arr[arr.length/2] + arr[arr.length/2 - 1]) / 2.0;
        } else {
            median = arr[arr.length/2];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            int count = map.getOrDefault(i, 0) + 1;
            map.put(i, count);
            if (count > maxCount) {
                maxCount = count;
                mode = i;
            }
        }

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }
}
