package generics;

public class Main {
    public static void main(String[] args) {

        MyClass<Integer> objInteger = new MyClass<>(10);
        objInteger.addListItems(new Integer[] {1, 2, 3, 4, 5});
        objInteger.printList();


        MyClass<Double> objDouble = new MyClass<>(10.00);
        objDouble.addListItems(new Double[] {1.2 , 2.1, 3.3, 4.5});
        objDouble.printList();


        MyClass<String> objString = new MyClass<>("Hannah");
        System.out.println(objString.attr);

        objString.addListItems(new String[] {"Max", "Bob", "Ana"});

        objString.printList();

        GenericMethod genericMethod = new GenericMethod();

        genericMethod.printValue("string");
        genericMethod.printValue(3.14);
        genericMethod.printValue(10);
        genericMethod.printValue('A');
        genericMethod.printValue(new int[] {1, 2, 3, 4});


        BoundedGenerics<Integer> boundedGenerics = new BoundedGenerics<>(10, 10);

    }

}
