public class CountDownRecursive {
    public static void main(String[] args) {
        printDescending(5);
    }

    public static void printDescending(int n) {
        if (n == 0) return;
        System.out.println(n);
        printDescending(n - 1);
    }
}

