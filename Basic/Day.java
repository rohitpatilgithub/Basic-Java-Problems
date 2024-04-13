package BasicMethods;
//Input the day number from the user, it will print the day.
import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 7.");
        System.out.print("Enter the day : ");
        int a = sc.nextInt();
        if(a<=7&&a>0){
            switch(a){
                case 1->{System.out.println("Today is Monday.");}
                case 2->{System.out.println("Today is Tuesday.");}
                case 3->{System.out.println("Today is Wednesday.");}
                case 4->{System.out.println("Today is Thursday.");}
                case 5->{System.out.println("Today is Friday.");}
                case 6->{System.out.println("Today is Saturday.");}
                case 7->{System.out.println("Today is Sunday.");}
            }
        }
        else {
            System.out.println(" : ) Enter number between 1 to 7 only.");
        }
    }
}
