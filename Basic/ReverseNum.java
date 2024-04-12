package BasicMethods;
// Print number in reverse by taking input from user
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt(); //declaring a variable to later use it in for loop
        for(int i = a;i>0;i--){ //for loop to print number in reverse
            System.out.println("Num : "+i);
        }
    }
}
