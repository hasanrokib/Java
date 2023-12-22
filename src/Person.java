public class Person {
    int age;
    String name;
    Person(int age,String name){
        this.name = name;
        this.age = age;

    }
}
class Student extends Person{
    String grade;
    Student(String name,int age,String grade){
        super(age, name);
        this.grade = grade;

    }
}
