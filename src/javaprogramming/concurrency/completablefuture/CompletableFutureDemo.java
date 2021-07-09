package javaprogramming.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> add = add(10, 20);
        CompletableFuture<Integer> add2 = add2(10, 20, 30);
        CompletableFuture<Integer> add3 = add3(10, 20, 30, 40);
        CompletableFuture<Integer> subtract = subtract(20, 10);
        CompletableFuture<Integer> subtract2 = subtract2(35, 20, 10);
        CompletableFuture<Integer> subtract3 = subtract3(40, 20, 10);

        System.out.println("add.get() = " + add.get());
        System.out.println("add2.get() = " + add2.get());
        System.out.println("add3.get() = " + add3.get());
        System.out.println("subtract.get() = " + subtract.get());
        System.out.println("subtract2.get() = " + subtract2.get());
        System.out.println("subtract3.get() = " + subtract3.get());
    }

    private static CompletableFuture<Integer> subtract3(int i, int i1, int i2) {
        return new Subtract3().subtract(i, i1, i2);
    }

    private static CompletableFuture<Integer> subtract2(int i, int i1, int i2) {
        return new Subtract2().subtract(i, i1, i2);
    }

    private static CompletableFuture<Integer> subtract(int i, int i1) {
        return new Subtract().subtract(i, i1);
    }

    private static CompletableFuture<Integer> add3(int i, int i1, int i2, int i3) {
        return new Add3().add(i, i1, i2, i3);
    }

    private static CompletableFuture<Integer> add2(int i, int i1, int i2) {
       return new Add2().add(i, i1, i2);
    }

    private static CompletableFuture<Integer> add(int i, int i1) {
       return new Add().add(i, i1);
    }
}
