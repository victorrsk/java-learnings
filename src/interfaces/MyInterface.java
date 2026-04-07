package interfaces;

public interface MyInterface extends MySuperInterface {

    int TEN = 10;

    public static void staticMethod() {
        System.out.println("Static methods must be implemented");
    }
    public void sayHello();
    public void implementThis();

    void subInterfaceMethod();
}
