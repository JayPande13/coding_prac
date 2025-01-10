package afternewgenprac;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String name;
    String gender;
    String city;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public Employee(String name, String gender, String city) {
        this.name = name;
        this.gender = gender;
        this.city = city;
    }
}

public class EmployeeMapOfMap {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jay","Male","Noida");
        Employee employee2 = new Employee("TT","Male","Noida");
        Employee employee3 = new Employee("RR","Female","Delhi");
        Employee employee4 = new Employee("yy","Male","Delhi");
        Employee employee5 = new Employee("U","Female","Delhi");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,2,3,4));
         list1.stream().filter(i->Collections.frequency(list1,i)>1).distinct().forEach(System.out::println);

        Map<String,Map<String,List<String>>> employeeMap = new HashMap<>();
//        employeeMap = employees.stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.groupingBy(
//                Employee::getGender,Collectors.mapping(Employee::getName,Collectors.toList())
//        )));

        for(Employee emp : employees){
            if(!employeeMap.containsKey(emp.getCity())){
                employeeMap.put(emp.getCity(),new HashMap<>());
                employeeMap.get(emp.getCity()).put("Male",new ArrayList<>());
                employeeMap.get(emp.getCity()).put("Female",new ArrayList<>());
            }
            if(emp.getGender().equalsIgnoreCase("Male")){
                employeeMap.get(emp.getCity()).get("Male").add(emp.getName());
            }else if(emp.getGender().equalsIgnoreCase("Female")){
                employeeMap.get(emp.getCity()).get("Female").add(emp.getName());
            }
        }


//        System.out.println(employeeMap);
    }

}
