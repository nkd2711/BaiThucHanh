package person;

public class PartTimeEmployee extends Employee {
    private int numberOfHours;

    public PartTimeEmployee(String name, int age, String nameOfWork, int numberOfHours) {
        this.name = name;
        this.age = age;
        this.nameOfWork = nameOfWork;
        this.numberOfHours = numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    @Override
    public int salaryCalculation() {
        return salary = 100 * numberOfHours;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Luong: " + salaryCalculation());
    }
}
