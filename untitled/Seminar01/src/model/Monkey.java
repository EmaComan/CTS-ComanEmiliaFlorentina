package model;

public class Monkey extends Animal{
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String keeperName) {
        System.out.println("Rasa: maimuta, keeperName = " + keeperName + ", numele animalului: " + super.getName() + ", varsta " + super.getAge());

    }
}
