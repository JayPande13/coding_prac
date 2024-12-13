package Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Employee {
        private Integer id;
        private String name;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Employee( int id,String name) {
            this.name = name;
            this.id = id;
        }

    }

    class caller{
    public static void main(String[] args){

        List<Employee> employeeList = List.of(
                new Employee(1, "Jay"),
                new Employee(1, "UYU"),
                new Employee(1, "kaus")
        );

        Map<Integer,Employee> employeeHashMap = employeeList.stream().collect(Collectors.toMap(e -> e.getId(), e -> e));

    }

}
