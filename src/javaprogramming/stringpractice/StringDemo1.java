package javaprogramming.stringpractice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringDemo1 {

    public static void main(String[] args) {
        String str = "reverse";
        System.out.println(subString(str));
    }

    public static String subString(String s){
        if(s.length() == 1)
            return s;

        String sub = s.substring(1, s.length());
        System.out.println("sub = " + sub);
        System.out.println("s.charAt(0) = " + s.charAt(0));
        return subString(sub) + s.charAt(0);
    }
}
