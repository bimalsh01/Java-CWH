import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second Number");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println(sum);
    }
}
