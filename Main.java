import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Number of days
            String tasks = sc.next(); // Task string

            HashSet<Character> seen = new HashSet<>();
            boolean suspicious = false;

            for (int i = 0; i < n; i++) {
                char current = tasks.charAt(i);

                // If this is not the first day and current task != previous task
                if (i > 0 && tasks.charAt(i) != tasks.charAt(i - 1)) {
                    if (seen.contains(current)) {
                        suspicious = true;
                        break;
                    }
                }

                // Mark current task as seen
                seen.add(current);
            }

            System.out.println(suspicious ? "NO" : "YES");
        }

        sc.close();
    }
}
