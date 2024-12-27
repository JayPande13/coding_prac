package afternewgenprac.LLD.FactoryDesign;

public abstract class EmployeeFactory {

    public Employee getEmployee(){
        Employee employee = fetchEmployee();
        System.out.println("Fetched Employee salary from EmployeeFactory " + employee.getSalary() );
        return employee;
//        if(employeeType.trim().equalsIgnoreCase("Android Developer")){
//            return new AndroidDeveloper();
//        }else if(employeeType.trim().equalsIgnoreCase("Web Developer")){
//            return new WebDeveloper();
//        }else{
//            return null;
//        }
    }

    public abstract Employee fetchEmployee();
}
