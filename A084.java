package day6_27;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A084{
    public static void wordBreak(List<String> dict, String str, String out){
        if (str.length() == 0)
        {
            System.out.println(out);
            return;
        }
        for (int i = 1; i <= str.length(); i++) {
            String prefix = str.substring(0, i);
            if (dict.contains(prefix)) {
                wordBreak(dict, str.substring(i), out + " " + prefix);
            }
        }
    }

public static void main(String[] args){
        List<String> dict = Arrays.asList("this", "th", "is", "famous", "Word", 
                                        "break", "b", "r", "e", "a", "k", "br", 
                                        "bre", "brea", "ak", "problem");
        Scanner br = new Scanner(System.in);
        String str=br.nextLine();
        wordBreak(dict, str, "");
    }
}

