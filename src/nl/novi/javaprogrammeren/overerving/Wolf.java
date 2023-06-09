package nl.novi.javaprogrammeren.overerving;

public class Wolf extends WildAnimal{
   String namePack;

    public Wolf(String name, String gender, String nameCage, String dayLastFed, String landOfBirth, String namePack) {
        super(name, gender, nameCage, dayLastFed, landOfBirth);
        this.namePack = namePack;
    }

    @Override
    public void sound(){
        System.out.println("awhooooooo");
    }
}
