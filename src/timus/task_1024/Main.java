package timus.task_1024;


import java.util.Scanner;

public class Main {
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt() - 1;
        }

        boolean[] visited = new boolean[n];
        int result = 1;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int cycleLength = 0;
                int current = i;

                while (!visited[current]) {
                    visited[current] = true;
                    current = p[current];
                    cycleLength++;
                }

                result = lcm(result, cycleLength);
            }
        }

        System.out.println(result);
    }
}
