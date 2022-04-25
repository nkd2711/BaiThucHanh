package person;

public class FullTimeEmployee extends Employee {
    private int numberOfDaysOutOfWork;

    public FullTimeEmployee(String name, int age, String nameOfWork, int numberOfDaysOutOfWork) {
        this.name = name;
        this.age = age;
        this.nameOfWork = nameOfWork;
        this.numberOfDaysOutOfWork = numberOfDaysOutOfWork;
    }

    public void setNumberOfDaysOutOfWork(int numberOfDaysOutOfWork) {
        this.numberOfDaysOutOfWork = numberOfDaysOutOfWork;
    }

    public int getNumberOfDaysOutOfWork() {
        return numberOfDaysOutOfWork;
    }

    @Override
    public int salaryCalculation() {
        return salary = 10000 - 500 * numberOfDaysOutOfWork;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Luong: " + salaryCalculation());
    }
}
