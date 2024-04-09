package BasicMethods;

import java.util.Scanner;

class LargeNums {
    Scanner sc = new Scanner(System.in);
    int[] num;
    void numlength() {
        System.out.println("Note : Only till length 5");
        System.out.print("Enter number of elements you want : ");
        int length = sc.nextInt();
        if (length < 5) {
            num = new int[length];
        } else {
            System.out.println("Dear enter less than 5 not 5 or greater than 5");
        }
    }

    void inputnum() {
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter number : ");
            num[i] = sc.nextInt();
        }
    }

    int sortnum() {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if(max<num[i]){
                max = num[i];
            }
        }
        System.out.println("Maximum number is : "+max);
        return max;
    }
}
public class LargeNumberArray {
    public static void main(String[] args) {
        LargeNums ok = new LargeNums();
        ok.numlength();
        ok.inputnum();
        ok.sortnum();

    }
}
