package nl.novi.javaprogrammeren.overerving;

public class Tijger extends WildAnimal{
    String numberOfStripe;


    public Tijger(String name, String gender, String nameCage, String dayLastFed, String landOfBirth, String numberOfStripe) {
        super(name, gender, nameCage, dayLastFed, landOfBirth);
        this.numberOfStripe = numberOfStripe;
    }
}
