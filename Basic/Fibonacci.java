package BasicMethods;
// Find the nth number in Fibonacci series.
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int count = 2;count<=n;count++){
            int temp = b;
            temp = temp+a;
            a = b;
            b = temp;
        }
        System.out.println(b);
    }
}
