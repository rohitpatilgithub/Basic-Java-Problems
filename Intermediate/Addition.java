package BasicMethods;

import java.util.Scanner;
//Enter number of elements you want to add & later get total of all the elements you entered in Array

class AdditionArray{
    Scanner sc = new Scanner(System.in);
    int[] num;
    void lengthnum(){  //method to know how much element the user wants
        System.out.print("Enter number of elements you want to add : ");
        num = new int[sc.nextInt()];
    }
    void inputnum(){   //method to take the input in array considering the length of array
        for(int i = 0;i< num.length;i++){
            System.out.print("Enter your number : ");
            num[i] = sc.nextInt();
        }
    }
    void totalis(){    //method to get total or add the elements entered by the user
        int total = 0;
        for(int i = 0;i<num.length;i++){
            total = num[i]+total;
        }
        System.out.println("Total is : "+total);
    }
}
public class Addition {
    public static void main(String[] args) {
        AdditionArray ok = new AdditionArray();
        ok.lengthnum();
        ok.inputnum();
        ok.totalis();
    }
}
