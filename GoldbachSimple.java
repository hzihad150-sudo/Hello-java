import java.util.Scanner;

public class GoldbachSimple {

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an even number greater than 2: ");
        int n = sc.nextInt();

        if (n <= 2 || n % 2 != 0) {
            System.out.println("Invalid input!");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (isPrime(i) && isPrime(n - i)) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                }
            }
        }

        sc.close();
    }
}
