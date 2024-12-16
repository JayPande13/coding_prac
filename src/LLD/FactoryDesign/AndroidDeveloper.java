package LLD.FactoryDesign;

public class AndroidDeveloper extends Employee{
    @Override
    public Integer getSalary() {
        System.out.println("Returning Salary Of Android Developer");
        return 40000;
    }
}
