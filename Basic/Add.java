package BasicMethods;

import java.util.Scanner;

//Add two numbers by taking numbers
class SumAdd{
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;
    void inputnum(){    //method to input number
        System.out.print("Enter first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        num2 = sc.nextInt();
    }
    int sumis(){        //method to get sum of numbers
        int addition = num1+num2;
        System.out.print("Sum of two numbers is : "+addition);
        return addition;
    }
}
public class Add {
    public static void main(String[] args) {
        SumAdd ok = new SumAdd();
        ok.inputnum();
        ok.sumis();
    }
}
