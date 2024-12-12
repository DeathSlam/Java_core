package lr5;

public class Test3 {
    private int first;
    private int second;

    public Test3(){
        this.first = 0;
        this.second = 0;
    }

    public Test3(int first){
        this.first = first;
        this.second = 0;
    }

    public Test3(int first,int second){
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args) {
        Test3 noInit = new Test3();
        Test3 firstInit = new Test3(2);
        Test3 firstAndSecondInit = new Test3(2, 10);

    }
}
