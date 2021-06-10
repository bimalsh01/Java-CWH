import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Scissor, Paper, Rock Game!");

        while (true){
            String sci = "Scissor";
            String pap = "Paper";
            String roc = "Rock";

            System.out.println("Enter your choice, s for 'Scissor' , p for 'Paper' , r for 'Rock' and q for 'Quit'" );
            String userInput = sc.next();

            if(!userInput.equals("r") && !userInput.equals("s") && !userInput.equals("p") && !userInput.equals("q")) {
                System.out.println("Your Input is not valid, Type s,r or p only. Try in another run! ");
                break;
            }

            else if(userInput.equals("s")){
                userInput = "Scissor";
                System.out.println("User input is : " + userInput);
            }
            else if(userInput.equals("r")){
                userInput = "Rock";
                System.out.println("User input is : " + userInput);
            }
            else if(userInput.equals("p")){
                userInput = "Paper";
                System.out.println("User input is : " + userInput);
            }

            if (userInput.equals("q")){
                break;
            }

            else {

                int random = (int)(Math.random()*3);
                String systemMove = "";

                if(random == 1){
                    systemMove = "Scissor";
                }
                else if(random == 2){
                    systemMove = "Paper";
                }
                else{
                    systemMove = "Rock";
                }

                System.out.println("System Move is: " + systemMove);

                    if(userInput.equals(systemMove)){
                        System.out.println("Draw Between System and User!");
                    }
                    else if ((userInput.equals("Scissor") && systemMove.equals("Paper")) || (userInput.equals("Paper") && systemMove.equals("Rock") || (userInput.equals("Rock") && systemMove.equals("Scissor"))) ){
                        System.out.println("User Won!");
                    }
                    else{
                        System.out.println("System Won!");
                    }
            }


            System.out.println("Thanks for playing, Come again!");
        }

    }
}


// By bimal Shrestha