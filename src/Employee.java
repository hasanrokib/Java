public class Employee {
    double basicSalary;
    Employee(double basicSalary){
        this.basicSalary =basicSalary;
    }
     void calculateSalary(){
        System.out.println("Basic Salary: "+basicSalary);
     }


}
class Manager extends Employee {
    double bonus;
    Manager(double basicSalary , double bonus){
        super(basicSalary);
        this.bonus= bonus;

    }

    @Override
    void calculateSalary() {
        super.calculateSalary();
        System.out.println("Manager Bonus:"+ bonus);
        System.out.println("Total Salary:" +(basicSalary+bonus));
    }
}
class Developer extends Employee{
    double incentives;
    Developer(double basicSalary, double incentives){
        super(basicSalary);
        this.incentives = incentives;

    }

    @Override
    void calculateSalary() {
        super.calculateSalary();
        System.out.println("Developer Incentives"+incentives);
        System.out.println("Total Salary:"+(basicSalary+incentives));
    }
}