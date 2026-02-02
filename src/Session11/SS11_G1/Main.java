package Session11.SS11_G1;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        employees[0] = new FullTimeEmployee(01, "Nguyen Manh Cuong", 8000000);
        employees[1] = new PartTimeEmployee(02, "Nguyen Manh Cuongg", 6,30000);

        for(Employee e: employees){
            e.showInfo();
            System.out.println(e.calculateSalary());
            if (e instanceof BonusEligible bonusEligible){
                System.out.println(bonusEligible.calculateBonus());
            }
        }

    }
}
