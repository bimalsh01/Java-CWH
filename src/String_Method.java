import java.util.Locale;

public class String_Method {
    public static void main(String[] args) {
        String name = "Bimal";
        System.out.println(name);

        // length of string
        int value = name.length();
        System.out.println("The string has length: " + value);

        // String to lower case
        String lowercase = name.toLowerCase();
        System.out.println("In lower case: " + lowercase);

        // String to upper case
        String uppercase = name.toUpperCase();
        System.out.println("In Upper case: " + uppercase);

        // name.trim = for clearing front and back string space.

        // substring means where to start form index
        // (it can be (0,1) first to last)
        System.out.println("The substring is: " + name.substring(3));

        // Replacing character - target can be multiple!
        System.out.println("The replaced name is: " + name.replace("m","h"));

        // Start with and end with
        System.out.println(name.startsWith("Bi"));
        System.out.println(name.endsWith("k"));

        // char at
        System.out.println("Character at index:"+name.charAt(3));

        // Index of
        System.out.println("Index of" + name.indexOf("l"));

        // Matching String
        System.out.println(name.equals("Bimal"));

        // Equal Ignore Case

        System.out.println("Ignoring: " + name.equalsIgnoreCase("BimAl"));

//        \n = New line
//            \b = back space in the text

    }
}
