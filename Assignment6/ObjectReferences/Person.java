package Assignments.Assignment6.ObjectReferences;

public class Person {
    String name;
    Person(String name)
    {
        this.name=name;
        System.out.println("name");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
