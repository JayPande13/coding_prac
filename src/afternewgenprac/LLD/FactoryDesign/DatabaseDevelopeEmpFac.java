package afternewgenprac.LLD.FactoryDesign;

public class DatabaseDevelopeEmpFac extends EmployeeFactory{
    @Override
    public Employee fetchEmployee() {
        return new DatabaseDeveloper();
    }
}
