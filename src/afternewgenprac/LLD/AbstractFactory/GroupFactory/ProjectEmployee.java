package afternewgenprac.LLD.AbstractFactory.GroupFactory;

import afternewgenprac.LLD.AbstractFactory.GroupedObjects.Employee;
import afternewgenprac.LLD.AbstractFactory.GroupedObjects.GroupLeadManager;
import afternewgenprac.LLD.AbstractFactory.GroupedObjects.Manager;
import afternewgenprac.LLD.AbstractFactory.GroupedObjects.SeniorSoftwareEngineerEmployee;

public class ProjectEmployee implements WorkForceFactory{
    @Override
    public Manager getManager() {
        System.out.println("Getting Group Lead from the Manager");
        return new GroupLeadManager();
    }

    @Override
    public Employee getEmployee() {
        System.out.println("Getting Senior Software Developer from the Employee");
        return new SeniorSoftwareEngineerEmployee();
    }
}
