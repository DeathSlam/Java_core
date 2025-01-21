package timus.task_1910;

import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {

        String inputFileName = "src/timus/timus_1910/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));
        PrintWriter out = new PrintWriter(System.out);

        int size = Integer.parseInt(bufferedReader.readLine());

        String[] strings = bufferedReader.readLine().split(" ");

        int[] instAfter = new int[size - 2];

        for (int i = 0; i < instAfter.length; i++) {
            instAfter[i] = Integer.parseInt(strings[i]) +
                    Integer.parseInt(strings[i + 1]) +
                    Integer.parseInt(strings[i + 2]);
        }

        int[] ints = Arrays.copyOf(instAfter, instAfter.length);
        Arrays.sort(instAfter);

        int firstValue = instAfter[instAfter.length - 1];

        for (int i = 0; i < instAfter.length; i++) {
            if (ints[i] == firstValue) {
                out.println(firstValue + " " + (i + 2));
                break;
            }
        }
        out.flush();
    }
}

