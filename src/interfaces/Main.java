package interfaces;

import interfaces.classes.MyInterfaceImp;

public class Main {
    public static void main(String[] args) {
        MyInterface obj = new MyInterfaceImp();
        obj.superInterfaceMethod();
    }


}
