package base.animal.app;

import base.animal.data.Animal;

public class InitData {
    private AnimalController controller;

    public InitData(AnimalController controller) {
        this.controller = controller;
    }

    public void initData() {
        controller.createAnimal(new Animal("Horsey the horsing horse", 3));
        controller.createAnimal(new Animal("Scrappy", "Dog", "Scrappiest", 2));
        controller.createAnimal(new Animal("Garfield", "Cat", "Laziest", 10));
        controller.createAnimal(new Animal("Scooby", "Dog", "Scarest", 8));
        controller.createAnimal(new Animal("Felix", "Cat", "Blackest", 5));
    }

    public AnimalController getController() {
        return controller;
    }

    public void setController(AnimalController controller) {
        this.controller = controller;
    }
}
