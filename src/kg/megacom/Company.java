package kg.megacom;

public class Company {

    private String name;
    private String address;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }


    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
