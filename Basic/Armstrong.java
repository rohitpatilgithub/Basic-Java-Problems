package BasicMethods;
//Find if given number is armstrong or not
public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temporary = num;
        int multi = 1;
        int sum = 0;
        int poweer = 0;
        while(num>0){
            num = num/10;
            poweer++;
        }
        num = temporary;
        System.out.println("Separating numbers and showing result \nafter multiplication " +
                "is done according to powers");
        while(num>0){
            int temp = num%10;
            for(int i = 1;i<=poweer;i++){
                multi = temp*multi;
            }
            sum = multi+sum;
            System.out.println(temp+" : "+multi);
            num/=10;
            multi = 1;
        }
        System.out.println("After armstrong formula : "+sum);
        System.out.println("Is the number a armstrong number : "+(sum==temporary));
    }
}
