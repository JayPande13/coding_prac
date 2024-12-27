package afternewgenprac.LLD.FactoryDesign;

public class AndroidDeveloperEmpFac extends EmployeeFactory{
    @Override
    public Employee fetchEmployee() {
        return new AndroidDeveloper();
    }
}
