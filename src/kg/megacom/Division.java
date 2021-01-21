package kg.megacom;

public class Division extends StructureUnit{

    private StructureUnit department;


    public Division(String name, Employee head, StructureUnit department) {
        super(name, head);
        this.department = department;
    }

    public StructureUnit getDepartment() {
        return department;
    }

    public void setDepartment(StructureUnit department) {
        this.department = department;
    }
}
