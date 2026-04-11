package interfaces;

public interface DefaultMethod {

    public default void defaultMethod() {
        System.out.println("This is a default method");
    }

}
