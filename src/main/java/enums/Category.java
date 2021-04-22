package enums;

public enum Category {
    PROGRAMMMING("programowanie"),
    DEV_OPS("administracja"),
    SCRUM("scrum"),
    TESTING("testowanie"),
    OTHER("inne");

    private final String name;

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
