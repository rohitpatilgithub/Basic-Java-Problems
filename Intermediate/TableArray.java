package BasicMethods;
//Q input number of elements ( condition under 5 or any other ) later enter number to print multiplication table
import java.util.Scanner;

class MyTable{
    Scanner sc = new Scanner(System.in);
    int[] num;
    void inputnum(){
        System.out.println("Only 5 elements");
        System.out.print("Enter number of elements which you want in table format : ");
        int length = sc.nextInt();
        if(length<5){
            num = new int[length];
        }
        else{
            System.out.println("Dear enter less than 5 not 5 or greater than 5");
        }
    }
    void enternum(){
        for(int i = 0;i<num.length;i++){
            System.out.print("Enter number for "+(i+1)+" element : ");
            num[i] = sc.nextInt();
        }
    }
    void tablegen(){
        for(int i = 0;i< num.length;i++){
            System.out.println("Table of "+num[i]+" is :");
            for(int j = 1;j<=10;j++){
                System.out.println(num[i]+" * "+j+" = "+(num[i]*j));
            }
            System.out.println();
        }
    }
}

public class TableArray {
    public static void main(String[] args) {
        MyTable ok = new MyTable();
        ok.inputnum();
        ok.enternum();
        ok.tablegen();
    }
}
