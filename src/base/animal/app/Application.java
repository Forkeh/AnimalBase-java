package base.animal.app;

import base.animal.data.Animal;
import base.animal.data.AnimalAgeComparator;
import base.animal.data.AnimalNameComparator;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    private AnimalController controller;

    public static void main(String[] args) {
        Application app = new Application();
        app.start();

    }

    public void start() {

        AnimalController controller = new AnimalController();
        InitData initData = new InitData(controller);
        initData.initData();

        List<Animal> animalList = controller.getAllAnimals();

        for (Animal anAnimal : animalList) {
            System.out.println(anAnimal);
        }

        System.out.println("---- Sorteret Liste efter navn ----");

        Comparator<Animal> sortByName = new AnimalNameComparator();

        Collection<Animal> animalListSortedName = controller.getAllAnimalsSorted(sortByName);

        for (Animal anAnimal : animalListSortedName) {
            System.out.println(anAnimal);
        }

        System.out.println("---- Sorteret Liste efter alder ----");

        Comparator<Animal> sortByAge = new AnimalAgeComparator();

        Collection<Animal> animalListSortedAge = controller.getAllAnimalsSorted(sortByAge.reversed());

        for (Animal anAnimal : animalListSortedAge) {
            System.out.println(anAnimal);
        }

        System.out.println("---- Sorteret Liste efter beskrivelse ----");

        Collection<Animal> animalListSortedDescr = controller.getAllAnimalsSorted(Comparator.comparing(Animal::getAge));

        for (Animal anAnimal : animalListSortedDescr) {
            System.out.println(anAnimal);
        }

        System.out.println("---- Filtered Liste efter type ----");

//        Collection<Animal> animalListFiltered = animalList.stream().filter(animal -> animal.getType().toLowerCase().contains("dog")).toList();
        Collection<Animal> animalListFiltered = controller.filterAnimals(animal -> animal.getType().toLowerCase().contains("cat"));

        for (Animal anAnimal : animalListFiltered) {
            System.out.println(anAnimal);
        }

        System.out.println("---- Filtered Liste efter alder > 5 ----");

        Collection<Animal> animalListFilteredByAge = controller.filterAnimals(animal -> animal.getAge() > 5);

        for (Animal anAnimal : animalListFilteredByAge) {
            System.out.println(anAnimal);
        }


    }
}
