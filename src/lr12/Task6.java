package lr12;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Task6 {
    public static int sumMultithreaded(int[] array) throws InterruptedException, ExecutionException {
        int cores = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(cores);
        int chunkSize = (int) Math.ceil((double) array.length / cores);

        Callable<Integer>[] tasks = new Callable[cores];
        for (int i = 0; i < cores; i++) {
            final int start = i * chunkSize;
            final int end = Math.min(array.length, start + chunkSize);
            tasks[i] = () -> {
                int sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                return sum;
            };
        }

        List<Future<Integer>> results = executor.invokeAll(Arrays.asList(tasks));
        executor.shutdown();

        int totalSum = 0;
        for (Future<Integer> f : results) {
            totalSum += f.get();
        }
        return totalSum;
    }

    public static void main(String[] args) throws Exception {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumMultithreaded(data);
        System.out.println("Сумма: " + sum);
    }
}
