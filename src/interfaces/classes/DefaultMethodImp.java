package interfaces.classes;

import interfaces.DefaultMethod;

public class DefaultMethodImp implements DefaultMethod {

    @Override
    public void defaultMethod() {
        System.out.println("Overriding interface default method");
    }
}
