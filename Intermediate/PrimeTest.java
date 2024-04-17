package BasicMethods.Methods;

//Find whether given number is prime or not.

import java.util.Scanner;

//Hint: Let n be the number to be checked. all the numbers from 0 to n are to be used to divide n.
// If and only if the remainder is zero for division with n and 1 then the number is prime, else not

class Prime{
    Scanner sc = new Scanner(System.in);
    int num;
    int count = 0;
    void isPrime(){
        System.out.print("Enter your number : ");
        num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count<=2){
            System.out.println("It is prime number.");
        }
        else {
            System.out.println("It is not prime number.");
        }
    }
}
public class PrimeTest {
    public static void main(String[] args) {
        Prime ok = new Prime();
        ok.isPrime();
    }
}
