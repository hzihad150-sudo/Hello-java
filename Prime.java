import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not a prime");
            return;
        }

        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not a prime");
                break;
            }
        }

        if (i == n) {
            System.out.println("Prime");
        }
    }
}
