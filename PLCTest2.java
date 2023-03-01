import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class PLCTest2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final String regex = "(0[xX][0-9a-fA-F]+)(Ui64|I64|u|l|L)?|([0-7]+)(i64|I64|u|U|l|L)?|([0-9][1-9][0-9]*)(i64|I64|u|U|l|L)?";

        String nums[] = new String[9];

        nums[0] = "28";
        nums[1] = "4000000024u";
        nums[2] = "2000000022l";
        nums[3] = "024";
        nums[4] = "04000000024u";
        nums[5] = "02000000022l";
        nums[6] = "0x2a";
        nums[7] = "0x4a44000000000020I64";
        nums[8] = "0x8a44000000000040Ui64";

        for(String s : nums){
            if(s.matches(regex)){
                System.out.println(s + " is a valid integer");
            }else{
                System.out.println(s + " is not an integer");
            }
        }
        System.out.println();

        System.out.print("Enter an integer >> ");
        final String input = console.nextLine();


        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(input);



        if(input.matches(regex)){
            System.out.println(input + " is a valid integer");
        }else{
            System.out.println(input + " is not an integer");
        }
    }
}