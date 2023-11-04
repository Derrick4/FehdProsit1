public class Main {
    public static void main(String[] args) {
        // Create a zoo with a maximum of 5 cages
        zoo myZoo = new zoo("My Zoo", "My City", 5);

        // Create animals with a constructor
        Animal lion = new Animal("Feline", "Lion", 5, true);
        Animal tiger = new Animal("Feline", "Tiger", 4, true);
        Animal elephant = new Animal("Mammal", "Elephant", 10, true);

        // Add animals to the zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);

        // Display the animals in the zoo
        myZoo.displayAnimals();

        // Search for an animal
        Animal searchAnimal = new Animal("Feline", "Tiger", 4, true);
        int foundIndex = myZoo.searchAnimal(searchAnimal);

        if (foundIndex != -1) {
            System.out.println("Animal found at index: " + foundIndex);
        } else {
            System.out.println("Animal not found.");
        }

        // Remove an animal
        Animal removeAnimal = new Animal("Feline", "Lion", 5, true);
        boolean removed = myZoo.removeAnimal(removeAnimal);

        if (removed) {
            System.out.println("Animal removed successfully.");
        } else {
            System.out.println("Animal not found or removal failed.");
        }
    }
}
