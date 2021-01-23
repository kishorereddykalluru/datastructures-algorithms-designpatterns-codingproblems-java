package javalearning.stringpractice;

public class StringDemo {
    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        String s1 = new String("GeeksForGeeks");

        System.out.println("s.equals(s1) = " + s.equals(s1));
        System.out.println("(s == s1) = " + (s == s1));

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
    }
}
