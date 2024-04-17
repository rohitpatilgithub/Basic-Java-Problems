package BasicMethods.Methods;
//Find whether number is even or odd
import java.util.Scanner;

class EverOrOdd{
    Scanner sc = new Scanner(System.in);
    int num;
    void numIs(){
        System.out.print("Enter your number : ");
        num = sc.nextInt();
         if(num==0){
             System.out.println("Your number is neither even nor odd.");
         } else if (num%2==0) {
             System.out.println("Your number is even number.");
         } else{
             System.out.println("Your number is odd number.");
         }
    }
}
public class EvenOdd {
    public static void main(String[] args) {
        EverOrOdd ok = new EverOrOdd();
        ok.numIs();
    }
}
