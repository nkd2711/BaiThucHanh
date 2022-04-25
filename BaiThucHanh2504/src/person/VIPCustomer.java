package person;

public class VIPCustomer extends Person {
    private int numberDaysOfVip;

    public void setNumberDaysOfVip(int numberDaysOfVip) {
        this.numberDaysOfVip = numberDaysOfVip;
    }

    public int getNumberDaysOfVip() {
        return numberDaysOfVip;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("So ngay VIP con lai: " + numberDaysOfVip);
        System.out.println("Vip duoc free");
    }
}
