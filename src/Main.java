public class Main {
    public static void main(String[] args) {
        Dog dogInstance = new Dog("Buddy",3);
        Cat catInstance = new Cat("Luffy", 2);


        System.out.println("Information about the Dog:");
        dogInstance.makeSound();
        dogInstance.printInfo();
        System.out.println("Information about the Cat:");
        catInstance.makeSound();
        catInstance.printInfo();
        Car car1 = new Car("Toyota",2023,"Camry");
        System.out.println("Make: " + car1.make);
        System.out.println("Year: " + car1.year);
        System.out.println("Model: " + car1.model);


    }
}