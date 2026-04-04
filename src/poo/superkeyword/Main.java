package poo.superkeyword;

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.setChildName("Child");
        obj.setSuperName("Super");

        System.out.println(obj.getChildName());
        System.out.println(obj.getSuperName());
    }
}
