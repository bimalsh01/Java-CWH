public class ResultingDatatype {
    public static void main(String[] args) {

        int a = 654 + 6; //Result is itiger
        float b = 6.54f + a;
        System.out.println(b);

        // Increment operator and decrement operator
        int i = 55;
        int j = i++; // Last ++ means first assigned and increment
        int k = ++i; //First ++ means value increases first
        System.out.println(j); //55
        System.out.println(k); //56

        //Simple solution
        int y = 7;
        int x = ++y+8;
        System.out.println(x);

        //Works for character too.
    }
}
