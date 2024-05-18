package ReloadThat;

import java.util.Scanner;

class PrimeCalculator {
    int num;
    void calculatePrime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        num = sc.nextInt();                 //enter your number from which it will find prime
        int count;
        for(int j = 1 ; j <= num ; j++){    // 1 - 10
            count=0;                        //after evey loop count assigns itself 0
            for(int i = 1 ; i <= j ; i++){  //1 - j
                if(j % i == 0){             //divisible or not
                    count++;                //count iteration
                }
            }
            if (count == 2) {
                System.out.println(j);      //count must be 2 ex: 7 is divisible by itself and 1 so count = 2
            }
            else{
                System.out.print("");       //if condition is false doesn't print anything
            }
        }
    }
}
public class PrimeGeneratorApplication {
    public static void main(String[] args) {
        PrimeCalculator primeNumberGenerator = new PrimeCalculator();
        primeNumberGenerator.calculatePrime();
    }
}
