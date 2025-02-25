package afternewgenprac.LLD.AbstractFactory.GroupFactory;

import afternewgenprac.LLD.AbstractFactory.GroupedObjects.Employee;
import afternewgenprac.LLD.AbstractFactory.GroupedObjects.Manager;
import afternewgenprac.LLD.AbstractFactory.GroupedObjects.ProductManager;
import afternewgenprac.LLD.AbstractFactory.GroupedObjects.TeamLeadEmployee;

public class ProductEmployee implements WorkForceFactory{
    @Override
    public Manager getManager() {
        System.out.println("Getting Product Manager from Manager");
        return new ProductManager();
    }

    @Override
    public Employee getEmployee() {
        System.out.println("Getting Team Lead Software Engineer from Employee");
        return new TeamLeadEmployee();
    }
}
