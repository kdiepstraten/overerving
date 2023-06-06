package nl.novi.javaprogrammeren.overerving;

public class Kat extends DomesticAnimals {
    Boolean outsideCat;

    public Kat(String name, String gender, String nameOwner, String favFoodBrand, String species, Boolean outsideCat) {
        super(name, gender, nameOwner, favFoodBrand, species);
        this.outsideCat = outsideCat;
    }
}
