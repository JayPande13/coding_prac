package afternewgenprac.LLD.AbstractFactory;

import afternewgenprac.LLD.AbstractFactory.GroupFactory.ProjectEmployee;
import afternewgenprac.LLD.AbstractFactory.GroupFactory.WorkForceFactory;
import afternewgenprac.LLD.AbstractFactory.GroupedObjects.Employee;
import afternewgenprac.LLD.AbstractFactory.GroupedObjects.Manager;

public class Client {
    public static void main(String[] args) {
        WorkForceFactory wr = new ProjectEmployee();
        Employee sse =  wr.getEmployee();
        Manager gl = wr.getManager();
        sse.getEmployeeDetails();
        gl.getManagerDetails();
    }
}
