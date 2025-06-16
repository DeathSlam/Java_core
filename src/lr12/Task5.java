package lr12;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Task5 {
    public static int findMaxMultithreaded(int[] array) throws InterruptedException, ExecutionException {
        int cores = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(cores);
        int chunkSize = (int) Math.ceil((double) array.length / cores);

        Callable<Integer>[] tasks = new Callable[cores];
        for (int i = 0; i < cores; i++) {
            final int start = i * chunkSize;
            final int end = Math.min(array.length, start + chunkSize);
            tasks[i] = () -> {
                int max = array[start];
                for (int j = start + 1; j < end; j++) {
                    if (array[j] > max) max = array[j];
                }
                return max;
            };
        }

        List<Future<Integer>> results = executor.invokeAll(Arrays.asList(tasks));
        executor.shutdown();

        int maxOverall = Integer.MIN_VALUE;
        for (Future<Integer> f : results) {
            maxOverall = Math.max(maxOverall, f.get());
        }
        return maxOverall;
    }

    public static void main(String[] args) throws Exception {
        int[] data = {5, 12, 8, 99, 3, 105, 67, 45, 200, 1, 76, 58};
        int max = findMaxMultithreaded(data);
        System.out.println("Максимум: " + max);
    }
}
