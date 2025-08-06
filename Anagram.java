import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() != b.length()) {
            return false;
        }
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);
        return Arrays.equals(charArrayA,charArrayB);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        boolean result = isAnagram(a , b);
        if(result) {
            System.out.println("Anagrams");

        } else {
            System.err.println("Not Anagrams");
        }
    }
    
}
