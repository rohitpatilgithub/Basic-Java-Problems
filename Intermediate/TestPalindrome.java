package BasicMethods.Methods;

import java.util.Scanner;

class Palindrome{
    Scanner sc = new Scanner(System.in);
    int num;
    void ispalindrome(){
        num = sc.nextInt();
        int copy = 0;
        int store = num;
        while(num>0){
            int temp = num%10;
            copy = temp+copy*10;
            num /=10;
        }
        System.out.println(copy);
        System.out.println(copy==store);
    }
}
public class TestPalindrome {
    public static void main(String[] args) {
        Palindrome ok = new Palindrome();
        ok.ispalindrome();
    }
}
