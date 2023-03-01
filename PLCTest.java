import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class PLCTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final String regex = "([a-zA-Z0-9!#$%&'*+\\-\\/=?^_`\\{|\\}~]+.[a-zA-Z0-9!#$%&'*+\\-\\/=?^_`\\{|\\}~]+|[a-zA-Z0-9!#$%&'*+\\-\\/=?^_`\\{|\\}~]+)+@(([a-zA-Z0-9!#$%&'*+\\/=?^_`\\{|\\}~]+|[a-zA-Z0-9!#$%&'*+\\/=?^_`\\{|\\}~][a-zA-Z0-9!#$%&'*+\\-\\/=?^_`\\{|\\}~]*[a-zA-Z0-9!#$%&'*+\\/=?^_`\\{|\\}~]).([a-zA-Z0-9!#$%&'*+\\/=?^_`\\{|\\}~]+|[a-zA-Z0-9!#$%&'*+\\/=?^_`\\{|\\}~][a-zA-Z0-9!#$%&'*+\\-\\/=?^_`\\{|\\}~]*[a-zA-Z0-9!#$%&'*+\\/=?^_`\\{|\\}~]))";

        String str = "dmaliro1@student.gsu";
        if(str.matches(regex)){
            System.out.println(str + " is a valid email address");
        }else{
            System.out.println(str + " is not a email address");
        }

        System.out.println();
        System.out.print("Enter the local part of your email address >> ");
        final String input = console.nextLine();

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(input);

        if(matcher.find() && matcher.group(0).equals(input)){
            System.out.println(input + " is a valid email");
        }else{
            System.out.println(input + " is not a valid email");
        }
    }
}
