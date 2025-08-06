import java.util.Scanner;
public class Even {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();

        if (w>2 && w%2 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}