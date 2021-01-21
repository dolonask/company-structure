package kg.megacom;

public class Position {

    private String name;
    private double minSalary;
    private double maxSalary;
    private StructureUnit unit;


    public Position(String name, double minSalary, double maxSalary) {
        this.name = name;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Position(String name, double minSalary, double maxSalary, StructureUnit unit) {
        this.name = name;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }


    public StructureUnit getUnit() {
        return unit;
    }

    public void setUnit(StructureUnit unit) {
        this.unit = unit;
    }
}
