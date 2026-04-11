package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyClass<T> {
    public T attr;
    public List<T> list = new ArrayList<>();

    public MyClass(T attr) {
        this.attr = attr;
    }

    public void printAttr() {
        System.out.println(this.attr);;
    }

    public void printList() {
        for (T item : list) {
            System.out.println(item);
        }
        System.out.println("\n");
    }

    public void addListItems(T[] items) {
        this.list.addAll(Arrays.asList(items));
    }
}
