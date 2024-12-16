package LLD.FactoryDesign;

public class WebDeveloper extends Employee{
    @Override
    public Integer getSalary() {
        System.out.println("Giving Salary of web developer");
        return 50000;
    }
}
