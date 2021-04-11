package task1;

public class TestClass {

    void method(int number) throws Exception {
        if (number < 0) {
            System.out.println("Number < 0");
        } else if (number > 0) {
            System.out.println("Number > 0");
        } else if (number == 0) {
            throw new Exception("test");
        } else {
            System.out.println("Else");
        }

    }
}




