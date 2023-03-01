import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PLCTest4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final String regex = "(b*ab*ab*)*(a*ba*ba*)*(a*ba*)((abaaba)*b)(c|d)*|(cbadcbad)*";

        String str = "aabbb";
        if(str.matches(regex)){
            System.out.println(str + " is a valid input");
        }else{
            System.out.println(str + " is not a valid input");
        }
        System.out.println();

        System.out.print("Enter a string >> ");
        final String input = console.nextLine();


        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(input);



        if(input.matches(regex)){
            System.out.println(input + " is a valid input");
        }else{
            System.out.println(input + " is not a valid input");
        }
    }
}
