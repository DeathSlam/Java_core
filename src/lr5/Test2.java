package lr5;

public class Test2 {
    private char chr1 = 'A', chr2 = 'H';

    public void getChars()
    {
        for (char ch = chr1; ch <= chr2; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Test2 test = new Test2();

        test.getChars();
    }
}
