package person;

public class Employee extends Person {
    protected String nameOfWork;
    protected int salary;

    public void setNameOfWork(String nameOfWork) {
        this.nameOfWork = nameOfWork;
    }

    public String getNameOfWork() {
        return nameOfWork;
    }

    public int salaryCalculation() {
        return salary = 0;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Ten cong viec: " + nameOfWork);
    }
}
