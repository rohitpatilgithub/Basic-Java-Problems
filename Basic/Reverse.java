package BasicMethods;
//Reverse print the given number.
public class Reverse {
    public static void main(String[] args) {
        int num = 2345;
        int rev = 0;
        while(num>0){
            int temp = num%10;
            num/=10;
            rev = (rev*10)+temp;
        }
        System.out.println(rev);
    }
}
