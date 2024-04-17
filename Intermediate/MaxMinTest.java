package BasicMethods.Methods;
//Find maximum number from given 3 numbers
import java.util.Scanner;

class Max{
    Scanner sc = new Scanner(System.in);
    int a;
    int b;
    int c;
    void maxis(){
        System.out.print("Enter your number : ");
        a = sc.nextInt();
        System.out.print("Enter your number : ");
        b = sc.nextInt();
        System.out.print("Enter your number : ");
        c = sc.nextInt();
        int max = Math.max(a,b);
        int max1 = Math.max(max,c);
        System.out.println("Maximum number is : "+max1);
    }
    void minis(){
        int min = Math.min(a,b);
        int min1 = Math.min(min,c);
        System.out.println("Minimum number is : "+min1);
    }
}
public class MaxMinTest {
    public static void main(String[] args) {
        Max ok = new Max();
        ok.maxis();
        ok.minis();
    }
}
