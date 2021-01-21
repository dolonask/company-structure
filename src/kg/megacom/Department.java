package kg.megacom;

public class Department extends StructureUnit{

    private StructureUnit directory;


    public Department(String name, Employee head, StructureUnit directory) {
        super(name, head);
        this.directory = directory;
    }

    public StructureUnit getDirectory() {
        return directory;
    }

    public void setDirectory(StructureUnit directory) {
        this.directory = directory;
    }
}
