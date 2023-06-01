package model;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String keeperName) {
        System.out.println("Rasa: leu, keeperName = " + keeperName + ", numele animalului: " + super.getName() + ", varsta " + super.getAge());
    }

}
