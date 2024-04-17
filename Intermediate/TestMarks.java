package BasicMethods.Methods;

import java.util.Scanner;

class Marks{
    Scanner sc = new Scanner(System.in);
    int total;
    void grades(){
        System.out.print("Enter your marks : ");
        total = sc.nextInt();
        if(total >90&& total <=100){
            System.out.println("AA");
        } else if (total >80&& total <=90) {
            System.out.println("AB");
        }
        else if (total >70&& total <=80) {
            System.out.println("BB");
        }else if (total >60&& total <=70) {
            System.out.println("BC");
        }else if (total >50&& total <=60) {
            System.out.println("CD");
        }else if (total >40&& total <=50) {
            System.out.println("DD");
        }
        else {
            System.out.println("Fail");
        }
    }
}
public class TestMarks {
    public static void main(String[] args) {
        Marks ok = new Marks();
        ok.grades();
    }
}
