package memorymanagement;

public class StringDemo {

    public static void main(String[] args) {

        String one = "hello";
        String two = "hello";

        if(one == two){
            System.out.println("same objects");
        } else {
            System.out.println("different objects");
        }

        if(one.equals(two)){
            System.out.println("values are same");
        } else {
            System.out.println("values are different");
        }
    }
}
