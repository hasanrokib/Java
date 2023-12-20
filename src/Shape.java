 abstract class Shape {
     abstract double calculateArea();
}
class Circle extends Shape {
     double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.1415 * radius * radius;
    }
}
class Rectangle extends Shape{
    double width , height;
    Rectangle(double width,double height){
        this.width = width;
        this.height = height;

    }
    public double calculateArea() {
        return width * height;
    }
}
