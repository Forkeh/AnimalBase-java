package base.animal.app;

import base.animal.data.Animal;

import java.util.*;
import java.util.function.Predicate;


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

    public Collection<Animal> getAllAnimalsSorted() {
        return new TreeSet<>(animalMap.values());
    }

    public Collection<Animal> getAllAnimalsSorted(Comparator<Animal> comparator) {
        List<Animal> sortedList = new ArrayList<Animal>(animalMap.values());
        sortedList.sort(comparator);
        return sortedList;
    }

    public Collection<Animal> filterAnimals(Predicate<Animal> predicate) {
        return new ArrayList<Animal>(animalMap.values()).stream().filter(predicate).toList();
    }
}
