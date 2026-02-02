package Session11.SS11_G1;

public class PartTimeEmployee extends Employee {

    private int workingHour;
    private double hourlyRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int id, String name, int workingHour, double hourlyRate) {
        super(id, name);
        this.workingHour = workingHour;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return workingHour * hourlyRate;
    }
}
