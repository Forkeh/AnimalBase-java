public class Application {

    public static void main(String[] args) {
        Application app = new Application();
        app.start();

    }

    public void start() {
        Animal testAnimal = new Animal("Horsey the horsing horse", 3);
        System.out.println(testAnimal);
    }
}
