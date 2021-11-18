package Assignments.Assignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sentence=scanner.nextLine();
        Pattern pattern=Pattern.compile("^[A-Z].*\\.$");
        System.out.println("Is sentence '"+sentence+"' starts with capital and ends with p" +
                "period :"+IsMatchingPattern(sentence,pattern));
    }
    public static boolean IsMatchingPattern(String sentence,Pattern pattern)
    {
        if(pattern.matcher(sentence).matches())
        {
            return true;
        }
      return false;
    }
}
