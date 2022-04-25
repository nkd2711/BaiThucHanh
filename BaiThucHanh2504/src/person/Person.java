package person;

import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;

    public void display() {
        System.out.println("Ten: " + name + "\nTuoi: " + age);
    }

    public void set() {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
    }
}
