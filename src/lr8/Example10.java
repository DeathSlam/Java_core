package lr8;
import java.io.*;

public class Example10 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\MyFile1.txt"), "cp1251"));

            out = new PrintWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("C:\\MyFile2.txt"), "cp1251"));

            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            try {
                if (br != null) br.close();
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии ресурсов: " + e.getMessage());
            }
        }
    }
}
