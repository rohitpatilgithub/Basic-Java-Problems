package BasicMethods;
//Q Print a table using methods

import java.util.Scanner;

class MultiplicationTable{
    Scanner sc = new Scanner(System.in);
    int num;
    int inputnum(){
        System.out.print("Enter your number to get multiplication table : ");
        num = sc.nextInt();
        return num;
    }
    void finalable(){
        for(int i = 1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
public class Table {
    public static void main(String[] args) {
        MultiplicationTable ok = new MultiplicationTable();
        ok.inputnum();
        ok.finalable();
    }
}
