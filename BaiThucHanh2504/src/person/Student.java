package person;

public class Student extends Person {
    protected String nameOfSchool;

    public void setNameOfSchool(String nameOfSchool){
        this.nameOfSchool = nameOfSchool;
    }

    public String getNameOfSchool(){
        return nameOfSchool;
    }

    @Override 
    public void display() {
        super.display();
        System.out.println("Ten truong: " + nameOfSchool);
    }
}
