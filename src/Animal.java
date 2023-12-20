public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name,int age ){
        this.name = name;
        this.age = age;

    }

    protected void printInfo() {
        System.out.println("Name: "+ name);
        System.out.println("Age:" + age);
    }
}
class Dog extends Animal {
    public Dog(String name, int age)
    {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name +" barks:Woof! Woof!");
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Type: Dog");

    }

}
class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    public void makeSound(){
        System.out.println(name + "meows: Meow! Meow!");
    }
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Type: Cat");
    }
}
