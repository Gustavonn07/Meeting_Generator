package model;

public abstract class AbstractPerson {
    protected String name;

    public AbstractPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
