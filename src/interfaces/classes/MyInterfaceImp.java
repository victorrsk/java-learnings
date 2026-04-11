package interfaces.classes;

import interfaces.MyInterface;

public class MyInterfaceImp implements MyInterface {


    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void implementThis() {
        System.out.println("Yaho");
    }

    @Override
    public void subInterfaceMethod() {
        System.out.println("Implemented");
    }

    public static void staticConstant() {
        // interfaces attributes are implicitly static/final/public
        System.out.println(TEN);
    }

    @Override
    public void method() {
        System.out.println("This is an superinterface constant: " + TEN);
    }

    @Override
    public void superInterfaceMethod() {
        System.out.println();
    }

    @Override
    public void anotherSuperMethod() {
    }
}
