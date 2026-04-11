package poo.innerclasses;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.outer);

        /*Outer.Inner inner = outer.new Inner();
        System.out.println(inner.inner);

        inner.printX();*/
    }

}
