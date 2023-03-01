import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class PLCTest3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final String regex = "[+-]?([0-9]*.[0-9]+|[0-9]+.)([eE]?[+-][0-9]+)?[LlFf]?|[+-]?[0-9]+[eE][+-?][0-9]+[LlFf]?";

        String nums[] = new String[5];

        nums[0] = "15.75L";
        nums[1] = "1.575E1";
        nums[2] = "1575e-2";
        nums[3] = "-2.5e-3F";
        nums[4] = "25E-4";

        for(String s : nums){
            if(s.matches(regex)){
                System.out.println(s + " is a valid float number");
            }else{
                System.out.println(s + " is not a float number");
            }
        }
        System.out.println();

        System.out.print("Enter a float number >> ");
        final String input = console.nextLine();


        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(input);



        if(input.matches(regex)){
            System.out.println(input + " is a valid float number");
        }else{
            System.out.println(input + " is not a float number");
        }
    }
}