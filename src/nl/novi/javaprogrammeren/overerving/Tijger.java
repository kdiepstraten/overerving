package nl.novi.javaprogrammeren.overerving;

public class Tijger extends WildAnimal{
    Integer numberOfStripe;


    public Tijger(String name, String gender, String nameCage, String dayLastFed, String landOfBirth, Integer numberOfStripe) {
        super(name, gender, nameCage, dayLastFed, landOfBirth);
        this.numberOfStripe = numberOfStripe;
    }

    @Override
    public void sound(){
        System.out.println("Grrrrr");
    }
}
