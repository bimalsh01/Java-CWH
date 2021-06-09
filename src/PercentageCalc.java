import java.util.Scanner;

public class PercentageCalc {
    public static void main(String[] args){
        System.out.println("Percentage calculator - by Bimal");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mark of english:");
        double eng = sc.nextDouble();

        System.out.println("Enter mark of math:");
        double math = sc.nextDouble();

        System.out.println("Enter mark of Science:");
        double science = sc.nextDouble();

        System.out.println("Enter mark of nepali:");
        double nepali = sc.nextDouble();

        double total = (eng+math+science+nepali)/500;
        double total_per = total*100;
        System.out.println("Your total percentage is:" + total_per);

    }
}
