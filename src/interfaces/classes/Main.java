package interfaces.classes;

import interfaces.DefaultMethod;
import interfaces.MyInterface;

public class Main {
    public static void main(String[] args) {
        MyInterface obj = new MyInterfaceImp();
        obj.method();

        DefaultMethod obj2 = new DefaultMethodImp();

        obj2.defaultMethod();
    }


}
