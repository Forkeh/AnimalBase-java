package base.animal.app;

import base.animal.data.Animal;
import org.jetbrains.annotations.NotNull;

public class InitData {
    private final AnimalController controller;

    public InitData(@NotNull AnimalController controller) {
        this.controller = controller;
    }

    public void initData() {
        controller.createAnimal(new Animal("Horsey the horsing horse", 3));
        controller.createAnimal(new Animal("Scrappy", "Dog", "Scrappiest", 2));
        controller.createAnimal(new Animal("Garfield", "Cat", "Laziest", 10));
        controller.createAnimal(new Animal("Scooby", "Dog", "Scarest", 8));
        controller.createAnimal(new Animal("Felix", "Cat", "Blackest", 5));
    }
}
