package nl.novi.javaprogrammeren.overerving;

public class WildAnimal extends Animal{
    String nameCage;
    String dayLastFed;
    String landOfBirth;

    public WildAnimal(String name, String gender, String nameCage, String dayLastFed, String landOfBirth) {
        super(name, gender);
        this.nameCage = nameCage;
        this.dayLastFed = dayLastFed;
        this.landOfBirth = landOfBirth;
    }
}
