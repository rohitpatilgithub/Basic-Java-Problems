package BasicMethods;
//Find the factorial of given integer and print the factorials of it.
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1;
        System.out.print("Factorial of "+num+" is ");
        while(num>1){
            int temp = num;
            num = num-1;
            factorial = temp*factorial;
            System.out.print(temp +" * ");
        }
        System.out.print("1 = "+factorial);
    }
}
