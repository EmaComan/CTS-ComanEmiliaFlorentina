package model;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private ZooKeeper zooKeeper;
    private List<Animal> animals;

    public Zoo(String name, ZooKeeper zooKeeper) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animals = new ArrayList<>();
    }

    public void feedAllAnimals() {
        if (this.animals != null && this.zooKeeper != null) {
            for (Animal animal : this.animals) {
                zooKeeper.feedAnimal(animal);
            }
        }
    }

    public void addAnimal(Animal animal) {
        if (animal != null) {
            this.animals.add(animal);
        }
    }
}
