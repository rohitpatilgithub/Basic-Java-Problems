package BasicMethods;
// take an array let user decide its length and let user enter every element in array; later print the array in reverse order
import java.util.Scanner;

class ReverseArray{
    Scanner sc = new Scanner(System.in);
    int[] num;
    int length;
    int lengthis(){     //takes array length as input
        System.out.print("Enter the length for your array : ");
        length = sc.nextInt();
        return length;
    }
    void inarray(){     //according to the array length, input is taken inside the array
        num = new int[length];
        for(int i = 0;i<num.length;i++){
            System.out.print("Enter your number : ");
            num[i] = sc.nextInt();
        }
    }
    void reverseis(){ //prints the array in reverse order
        for(int i = (num.length-1);i>=0;i--){
            System.out.print("Num : ");
            System.out.println(num[i]);
        }
    }
}
public class ReverseNumArray {
    public static void main(String[] args) {
        ReverseArray ok = new ReverseArray();
        ok.lengthis();
        ok.inarray();
        ok.reverseis();
    }
}
