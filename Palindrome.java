import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String num = sc.next(); 
        
        String rev = new StringBuilder(num).reverse().toString(); 
        
        if (num.equals(rev)) {
            System.out.println( " is a palindrome number.");
        } else {
            System.out.println( " is not a palindrome number.");
        }
        
        
    }
}