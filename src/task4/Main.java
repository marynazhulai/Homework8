package task4;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        }
        /*catch (Exception e) {
            e.printStackTrace();}*/

        catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}

