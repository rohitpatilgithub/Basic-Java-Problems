package BasicMethods;
//Separate each digit from given number.
public class Separate {
    public static void main(String[] args) {
        int a = 123;
        while (a>0){
            int temp = a;
            temp%=10;
            System.out.println(temp);
            a/=10;
        }
    }
}
