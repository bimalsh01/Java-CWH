import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;
            int pow_of_2 = 1;
            for (int j = 0; j<n;j++){
                sum+= pow_of_2*b;
                pow_of_2*=2;
                System.out.print(sum+"");

            }
            System.out.println();



        }
        in.close();
    }
}