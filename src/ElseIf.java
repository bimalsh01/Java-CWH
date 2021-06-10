import java.util.Scanner;
public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");

        int age = sc.nextInt();

        if(age>56){
            System.out.println("You are Matured!");
        }
        else if(age>36){
            System.out.println("You are little matured!");
        }
        else {
            System.out.println("You are not mature!");
        }

        switch (age){ // age is user input
            case 18:
                System.out.println("You are an adult");
                break;

            case 20:
                System.out.println("Rohit is going to be married");
                break;

            case 26:
                System.out.println("Chirag is fine for job");
                break;
        }
    }
}

//if else if else if else ladder