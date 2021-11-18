package Assignments.Assignments8;

class Person
{
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static Person getInstance(String name, int age, char gender) throws Exception {
        if(name.length()<6)
        {
            throw new InValidLengthException();
        }
        if(age<18)
        {
            throw new InvalidAgeException();
        }
        if(!(gender!='M'|| gender!='m' || gender!='F' || gender!='f'))
        {
            throw new InvalidCharException();
        }
        return new Person(name,age,gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
       Person person;
        try
        {
            person=Person.getInstance(null,23,'M');
            System.out.println(person);
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("executed finally");
        }

    }
}
