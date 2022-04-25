import car.*;
import person.*;
import animal.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Test Person
        OfflineStudent offStu = new OfflineStudent("Duy", 19, "Mo - Dia Chat", 8);
        offStu.display();

        OnlineStudent onlStu = new OnlineStudent("Duy", 19, "Mo - Dia Chat", "Java OOP");
        onlStu.display();

        PartTimeEmployee pt = new PartTimeEmployee("Duy", 19, "Lap Trinh Vien", 20);
        pt.display();

        FullTimeEmployee ft = new FullTimeEmployee("Duy", 19, "Quan Ly Du An", 2);
        ft.display();

        // Test car
        Car c = new TaxiCar();
        c.Move();
        c.Reverse();
        c.Stop();
        c.TurnLeft();
        c.TurnRight();

        // Test animal
        Animal a = new Tiger();
        a.Eat();
        a.Roar();
        a.Run();
        a.Sleep();
        a.Walk();
    }
}
