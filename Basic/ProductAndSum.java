package BasicMethods;
//Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;

public class ProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 4421;
        int product = 1;
        int sum = 0;
        while(a>0){
            int temp = a%10;
            a/=10;
            product = temp*product;
            sum = temp+sum;
        }
        int ans = product-sum;
        System.out.println("Ans is : "+ans);
    }
}
