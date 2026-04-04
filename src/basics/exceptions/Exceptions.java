package basics.exceptions;

public class Exceptions {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

        try {
            String[] arr = "A B C D E F".split(" ");
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
        }
        finally {
            System.out.println("Blah");
        }

        /*try {
            method1();
        }
        catch (Exception e) {
            e.printStackTrace();
        }*/
        try {
            randomMethod(9);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void method1() {
        method2();
    }

    public static void method2(){
        method3();
    }

    public static void method3() {
        System.out.println(10 / 0);
    }

    public static void randomMethod(int num) throws MyException {
        if (num < 10) {
            throw new MyException("Number below 10");
        }
    }
}
