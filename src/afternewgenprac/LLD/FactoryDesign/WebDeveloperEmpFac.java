package afternewgenprac.LLD.FactoryDesign;

public class WebDeveloperEmpFac extends EmployeeFactory {
    @Override
    public Employee fetchEmployee() {
        return new WebDeveloper();
    }
}
