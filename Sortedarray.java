import java.util.Arrays;

public class Sortedarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 12, 15, 26, 38};
        int[] arr2 = {2, 13, 17, 30, 45};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        System.out.println("Merged array: " + Arrays.toString(merged));

        int total = n1 + n2;
        double median;
        if (total % 2 == 0) {
            median = (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        } else {
            median = merged[total / 2];
        }

        System.out.println("Median: " + (int)median);
    }
}
