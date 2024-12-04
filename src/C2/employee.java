package C2;

public class employee {
    private String name;
    private Integer age;
    private Integer salary;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    public Integer getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public employee(String name, Integer age, Integer salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public employee() {
        super();
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
