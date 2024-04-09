package BasicMethods;

import java.util.Scanner;

class LargeNum{
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;
    void enternum(){
        System.out.print("Enter number 1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        num2 = sc.nextInt();
    }
    void largenumber(){
        if(num1==num2){
            System.out.println("Both have equal values");
        }
        else    if(num1>num2){
            System.out.println("Number 1 is greater than number 2");
        }
        else {
            System.out.println("Number 2 is greater than number 1");
        }
    }
}
public class LargeNumber {
    public static void main(String[] args) {
        LargeNum ok = new LargeNum();
        ok.enternum();
        ok.largenumber();
    }
}
