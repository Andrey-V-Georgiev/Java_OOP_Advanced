package _11_LiskovAndOCP_LAB.P04_DetailPrinter;

public class Manager extends Employee {

    private Iterable<String> documents;

    public Manager(String name, Iterable<String> documents) {
        super(name);
        this.documents = documents;
    }

    @Override
    public String toString() {
        return String.format("Manager: %s", super.getName());
    }
}
