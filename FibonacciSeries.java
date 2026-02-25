import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int n = sc.nextInt();

        int First = 0;
        int Second = 1;
        int fibo;

        System.out.print(First + " " + Second);

        for (int i = 3; i <= n; i++) {
            fibo = First + Second;
            System.out.print(" " + fibo);

            First = Second;  
            Second = fibo;
        }
		System.out,println();
    }
}
