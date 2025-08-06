import java.util.Scanner;

public class printing{
    public static void main(String[] args) {
        printing scanner = new printing(System.in);

        int n = scanner.nextInt();
        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        scanner.close();
    }
}

