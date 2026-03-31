package poo.Super;

public class Child extends Super {
    public String name;
    public String text;

    public String getSuperName() {
        return super.name;
    }

    public void setSuperName(String name) {
        super.name = name;
    }

    public String getChildName() {
        return this.name;
    }

    public void setChildName(String name) {
        this.name = name;
    }

    /*@Override
    public void cantOverride() {

    }*/

}
