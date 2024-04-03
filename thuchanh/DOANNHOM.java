package thuchanh123;

public class DOANNHOM {

    public static int cong(int a, int b) {
        return a + b;
    }

    public static int tru(int a, int b) {
        return a - b;
    }

    public static int nhan(int a, int b) {
        return a * b;
    }

    public static int chia(int a, int b) {
        return a / b;
    }
}public interface ICalculator {

    int cong(int a, int b);

    int tru(int a, int b);

    int nhan(int a, int b);

    int chia(int a, int b);
}public class Main {

    public static void main(String[] args) {
        ICalculator calculator = new DOANNHOM();

        int a = 10;
        int b = 5;

        System.out.println("a + b = " + calculator.cong(a, b));
        System.out.println("a - b = " + calculator.tru(a, b));
        System.out.println("a * b = " + calculator.nhan(a, b));
        System.out.println("a / b = " + calculator.chia(a, b));
    }
}
