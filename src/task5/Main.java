package task5;

public class Main {

    public static void main(String[] args) {

       try {
           iCanThrowException();
       }
       catch (NullPointerException n){
           System.out.println("NPE");
       }
    }


    public static void iCanThrowException() {
        Integer n = null;
        System.out.println(n.toString());

    }

}