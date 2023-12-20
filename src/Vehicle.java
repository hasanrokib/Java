public class Vehicle {
     String make;
     int year;
     public Vehicle(String make, int year){
         this.make = make;
         this.year = year;
     }

}
class Car extends Vehicle {
    String model;
    Car(String make,int year,String model) {
        super(make, year);
        this.model=model;
    }

}
