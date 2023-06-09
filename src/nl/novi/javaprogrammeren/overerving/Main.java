package nl.novi.javaprogrammeren.overerving;

public class Main {
    public static void main(String[] args) {


    Leeuw lion = new Leeuw("Jesse", "Male", "number1","Tuesday","Guatamala", 0);
    Tijger tijger = new Tijger("Tony","Male", "number2","Wednesday","Singapore", 300);
    Wolf wolf = new Wolf("Scott", "male", "number3", "Monday", "America/Minisota", "Scott's Pack");
    Kat kat = new Kat("Bella", "female", "Elise", "Wiskas", "Boerderijkat", false);
    Hond hond = new Hond("Puck", "female", "Trudy", "Brokjes", "Jack Russell/ Kooiker");

    hond.sleep();
        System.out.println(hond.name);
        System.out.println("This tijger named " + tijger.name + " comes from " + tijger.landOfBirth);
        System.out.println(wolf.name + " is the leader of " + wolf.namePack);
        System.out.println(kat.nameOwner + " is the owner of " + kat.name);
}
}
