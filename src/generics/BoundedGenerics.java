package generics;

public class BoundedGenerics <T extends Number>{
    public T value1, value2;

    public BoundedGenerics(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void sum() {
        System.out.println(value1.doubleValue() + value2.doubleValue());
    }
}
