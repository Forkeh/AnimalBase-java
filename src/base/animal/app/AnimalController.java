package base.animal.app;

import base.animal.data.Animal;

import java.util.*;


public class AnimalController {
    private Map<Integer, Animal> animalMap;
    private int lastId;

    public AnimalController() {
        lastId = 0;
        this.animalMap = new HashMap<>();
    }

    public Animal createAnimal(Animal recievedAnimal) {
        Animal animal = new Animal(recievedAnimal);
        lastId = lastId + 1;
        animal.setId(lastId);
        this.animalMap.put(animal.getId(), animal);

        return animal;
    }

    public List<Animal> getAllAnimals() {
        return new ArrayList<Animal>(this.animalMap.values());
    }
}
