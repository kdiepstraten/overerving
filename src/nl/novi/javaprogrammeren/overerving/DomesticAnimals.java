package nl.novi.javaprogrammeren.overerving;

public class DomesticAnimals extends Animal{
    String nameOwner;
    String favFoodBrand;
    String species;

    public DomesticAnimals(String name, String gender, String nameOwner, String favFoodBrand, String species) {
        super(name, gender);
        this.nameOwner = nameOwner;
        this.favFoodBrand = favFoodBrand;
        this.species = species;
    }
}
