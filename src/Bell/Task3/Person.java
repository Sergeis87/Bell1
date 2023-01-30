package Bell.Task3;

public class Person {
    private String name;
    private int age;
    private Position position;
    private int salary;
    private Value value;

    enum Position{
        MIDDLE_JAVA_DEV, SENIOR_JAVA_AUTOMATION, JUNIOR_FUNCTIONAL_TESTER, DEV_OPS
    }
    enum Value{
        RUB, USD
    }

    @Override
    public String toString() {
        return "Bell.Task3.Workers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=" + position +
                ", salary=" + salary +
                ", value=" + value +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Person(String name, int age, Position position, int salary, Value value) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.value = value;
    }
}
