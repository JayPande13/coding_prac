package LLD.FactoryDesign;

public class Client {
    public static void main(String[] args) {
        Employee employeeFactory = EmployeeFactory.getEmployee("Android Developer");
        if(employeeFactory != null)
         System.out.println(employeeFactory.getSalary());
    }
}
