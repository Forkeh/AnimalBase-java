
package base.animal.data;

public class Animal {
    int id;
    String name;
    String type;
    String description;
    int age;
    boolean star;
    boolean winner;

    public Animal() {}

    public Animal(Animal animal) {
        this.id = animal.id;
        this.name = animal.name;
        this.type = animal.type;
        this.description = animal.description;
        this.age = animal.age;
        this.star = animal.star;
        this.winner = animal.winner;
    }

    public Animal(String name, String type, String description, int age) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.age = age;
    }

    public Animal(String animalString, int age) {
        String[] stringArr = animalString.split(" ");

        this.age = age;
        this.name = stringArr[0];
        this.description = stringArr[2];
        this.type = stringArr[3];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStar() {
        return star;
    }

    public void setStar(boolean star) {
        this.star = star;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "Animal - {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", age=" + age +
                ", star=" + star +
                ", winner=" + winner +
                '}';
    }
}
