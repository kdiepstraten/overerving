package nl.novi.javaprogrammeren.overerving;

public class Animal {
     String name;
     String gender;

    public Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

//    Methodes:
    public void move(){
        System.out.println(this.name + " has moved 0.25 meter.");
    }
    public void sound(){
        System.out.println(" ");
    }

    public void sleep(){
        System.out.println("Please dont wake me im sleeping for another 8 hours");
    }

    public void eat(String food){
        System.out.println("I like to eat " + food);
    }
}
