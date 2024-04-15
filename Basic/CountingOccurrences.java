package BasicMethods;
//Find how many times number 3 is repeated from the given number.
public class CountingOccurrences {
    public static void main(String[] args) {
        int num = 12343639;
        int temp = num;
        int count = 0;
        while(temp>0){
            temp = num;
            temp = temp%10;
            if(temp==3){
                count++;
            }
            temp = num;
            num = num/10;
        }
        System.out.println("There are total "+count+" numbers");
    }
}
