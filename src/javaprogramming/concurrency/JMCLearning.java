package javaprogramming.concurrency;

public class JMCLearning {

    public void executeUnlimited(){

        while(true){
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        }
    }


    public static void main(String[] args) {
        JMCLearning learning = new JMCLearning();
        learning.executeUnlimited();
    }
}
