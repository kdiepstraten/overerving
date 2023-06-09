package nl.novi.javaprogrammeren.overerving;

public class Leeuw extends WildAnimal{
    Integer numberOfKids;


    public Leeuw(String name, String gender, String nameCage, String dayLastFed, String landOfBirth, Integer numberOfKids) {
        super(name, gender, nameCage, dayLastFed, landOfBirth);
        this.numberOfKids = numberOfKids;
    }
    @Override
    public void sound(){
        System.out.println("Roarrr");
    }
}
