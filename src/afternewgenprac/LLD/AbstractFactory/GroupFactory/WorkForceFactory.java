package afternewgenprac.LLD.AbstractFactory.GroupFactory;

import afternewgenprac.LLD.AbstractFactory.GroupedObjects.Employee;
import afternewgenprac.LLD.AbstractFactory.GroupedObjects.Manager;

public interface WorkForceFactory {
    public Employee getEmployee();
    public Manager getManager();
}
