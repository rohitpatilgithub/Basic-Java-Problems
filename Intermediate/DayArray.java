package BasicMethods;
//Make a String array, enter number to check which Day is today from that array.
import java.util.Scanner;

class DayCount{
    Scanner sc = new Scanner(System.in);
    String[] day = new String[7];
    int num;
    void daysare(){ //Assigning each array element a day
        day[0] = "Monday";
        day[1] = "Tuesday";
        day[2] = "Wednesday";
        day[3] = "Thursday";
        day[4] = "Friday";
        day[5] = "Saturday";
        day[6] = "Sunday";
    }
    void findday(){ //Method to find the day
        System.out.print("Enter your day : ");
        num = sc.nextInt();
        if(num<=7&&num>0){
            System.out.println("Today is "+day[(num-1)]);
        }
        else {
            System.out.println("Please enter number in range 1 - 7.");
        }
    }
}
public class DayArray {
    public static void main(String[] args) {
        DayCount ok = new DayCount();
        ok.daysare();
        ok.findday();
    }
}
