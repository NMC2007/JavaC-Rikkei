package Session11.SS11_G1;

public class FullTimeEmployee extends Employee implements BonusEligible {
    private double salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }
}
