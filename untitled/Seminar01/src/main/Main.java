package main;

import model.*;

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("Ciprian");
        Zoo zoo = new Zoo("Neamt beasts", zooKeeper);
        zoo.addAnimal(new Lion("Valentin", 21));
        zoo.addAnimal(new Zebra("Claudia", 22));
        zoo.addAnimal(new Monkey("Nadina",50));
        zoo.feedAllAnimals();
    }
}