package poo.enums;

public enum EnumClass {
    BIG("Big thing"),
    BIGGER("Bigger thing"),
    SMALL("Small thing"),
    SMALLER("Smaller thing");

    private final String description;

    private EnumClass(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }

}
