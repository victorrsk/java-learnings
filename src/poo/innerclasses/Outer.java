package poo.innerclasses;

public class Outer {
    public String outer = "outer attribute";
    public static int x = 10;

    private static class Inner {
        public String inner = "inner attribute";
        public static String staticAttr = "static";
        public int x = 20;

        public void printX() {
            System.out.println(x);
            System.out.println(Outer.x);
        }

        public void printAttr() {
            System.out.println(inner);
            System.out.println(staticAttr);
        }

    }

}
