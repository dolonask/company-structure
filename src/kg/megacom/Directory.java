package kg.megacom;

public class Directory extends StructureUnit{

    private Company company;

    public Directory(String name, Employee head, Company company) {
        super(name, head);
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


}
