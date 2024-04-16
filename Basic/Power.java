package BasicMethods;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter power : ");
        int p = sc.nextInt();
        int a = 1;
        for(int i = 1;i<=p;i++){
            a = a*num;
        }
        System.out.println("Your ans is : "+a);
    }
}
