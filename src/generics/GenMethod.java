package generics;

public class GenMethod {

    public static <T> void genericsDisplay(T element){
        System.out.println("element.getClass().getName() = " + element.getClass().getName());
        System.out.println("element = " + element);
    }
}
