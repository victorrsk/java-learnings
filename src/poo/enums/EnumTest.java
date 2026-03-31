package poo.enums;

public class EnumTest {
    static void main(String[] args) {
        EnumClass size = EnumClass.BIGGER;
        System.out.println(size.getDescription());
        System.out.println(EnumClass.valueOf("SMALLER"));
        System.out.println(EnumClass.SMALLER.getDescription());

        EnumInsideAClass.Price enumPrice = EnumInsideAClass.Price.CHEAP;

        System.out.println(enumPrice);

        for (EnumInsideAClass.Price price : EnumInsideAClass.Price.values()) {
            System.out.println(price);
        }
    }
}
