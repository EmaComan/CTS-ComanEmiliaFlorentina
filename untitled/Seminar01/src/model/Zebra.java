package model;

public class Zebra extends Animal{
    public Zebra(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String keeperName) {
        System.out.println("Rasa: zebra, keeperName = " + keeperName + ", numele animalului: " + super.getName() + ", varsta " + super.getAge());

    }
}
