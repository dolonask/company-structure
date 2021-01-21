package kg.megacom;

public class StructureUnit {


    private String name;
    private Employee head;

    public StructureUnit(String name, Employee head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getHead() {
        return head;
    }

    public void setHead(Employee head) {
        this.head = head;
    }
}
