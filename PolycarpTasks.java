import java.util.*;

public class PolycarpTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // number of test cases

        while (t-- > 0) {
            int n = Integer.parseInt(sc.nextLine()); // number of days
            String s = sc.nextLine(); // task sequence

            Set<Character> seen = new HashSet<>();
            boolean suspicious = false;

            for (int i = 0; i < n; i++) {
                char current = s.charAt(i);
                if (i > 0 && current != s.charAt(i - 1) && seen.contains(current)) {
                    suspicious = true;
                    break;
                }
                seen.add(current);
            }

            System.out.println(suspicious ? "NO" : "YES");
        }

        sc.close();
    }
}
