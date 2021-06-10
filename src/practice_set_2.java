import java.util.Scanner;

public class practice_set_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Question 2
//        int a = 10;
//
//        if(a==11){
//            System.out.println();
//        }

//        //Question 2
//        int eng,math,science;  // we can make it at once!
//
//        System.out.println("Enter mark of English:");
//        eng = sc.nextInt();
//
//        System.out.println("Enter mark of Math:");
//        math = sc.nextInt();
//
//        System.out.println("Enter mark of Science:");
//        science = sc.nextInt();
//
//        double total = (eng+math+science)/3.0;
//
//        if(total>=40 && eng>=33 && math>=33 && science>=33){
//            System.out.println("Congrats! You are passed. Percentage:" + total);
//        }
//        else {
//            System.out.println("You are failed!");
//        }
//

          // Question 3 income tax calculator
//        System.out.println("Enter your Income Here:");
//        float income = sc.nextFloat();
//
//        float tax = 0;
//        if(income<2.5){
//            tax = tax + 0;
//            System.out.println("No tax for you");
//        }
//        else if(income>=2.5 && income<5){
//            tax = tax + 0.05f * (income - 2.5f);
//            System.out.println("2.5-5 lakhs");
//
//        }
//        else if(income>=5 && income<10){
//            tax = tax + 0.05f * (income - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//            System.out.println("5-10 Lakhs");
//
//
//        }
//        else if(income>10){
//            tax = tax + 0.05f * (income - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//            tax = tax + 0.3f * (income - 10f);
//            System.out.println("Above 10Lakhs");
//        }
//        System.out.println("Your tax is" + tax + "%");
//
       // Question:4    //Case
//        System.out.println("Enter the number:");
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thrusday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//        }

       // Question-5
//        int year = sc.nextInt();
//
//        if ((year%4==0) && (year%100!=0) || (year%400==0)){
//            System.out.println("its leap year");
//        }else {
//            System.out.println("Its not leap year");
//        }

        // Question-6
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("Its organization website");
        } else if(website.endsWith(".np")){
            System.out.println("Its Neplease Website");
        }else{
            System.out.println("Its a crook site");
        }











    }
}

