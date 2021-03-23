package javaprogramming.concurrency;

public class MainThread {

    public static void main(String[] args) {

        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        Thread.State state = Thread.currentThread().getState();
        String threadGroupName = Thread.currentThread().getThreadGroup().getName();


        System.out.println("id = " + id + ", name = "+name + ", priority = "+priority
        +", state = "+state+", thread group name = "+threadGroupName);
    }
}
