package base.animal.app;

import base.animal.data.Animal;

import java.util.List;

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
    }
}
