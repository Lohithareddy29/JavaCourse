public class Selectionsort {
    void selectionSort(int[] arr) {
        int n = arr.length;

        
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Selectionsort sorter = new Selectionsort();
        int[] data = {29, 10, 14, 37, 13};
        
        System.out.println("Original array:");
        sorter.printArray(data);

        sorter.selectionSort(data);

        System.out.println("Sorted array:");
        sorter.printArray(data);
    }
}
