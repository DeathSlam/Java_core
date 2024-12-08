package lr4;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод текста для шифрования
        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        // Ввод ключа для шифрования
        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        // Шифрование текста
        StringBuilder encryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if ((c >= 'А' && c <= 'Я') || (c >= 'а' && c <= 'я')) {
                char base = (c >= 'а') ? 'а' : 'А';
                encryptedText.append((char) ((c - base + key + 33) % 33 + base));
            } else {
                encryptedText.append(c); // Неизменные символы
            }
        }
        System.out.println("Текст после преобразования: " + encryptedText);

        // Обратное преобразование
        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("y")) {
                StringBuilder decryptedText = new StringBuilder();
                for (char c : encryptedText.toString().toCharArray()) {
                    if ((c >= 'А' && c <= 'Я') || (c >= 'а' && c <= 'я')) {
                        char base = (c >= 'а') ? 'а' : 'А';
                        decryptedText.append((char) ((c - base - key + 33) % 33 + base));
                    } else {
                        decryptedText.append(c); // Неизменные символы
                    }
                }
                System.out.println("Расшифрованный текст: " + decryptedText);
                break;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ.");
            }
        }
    }
}
