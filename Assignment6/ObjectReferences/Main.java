package Assignments.Assignment6.ObjectReferences;

public class Main {
    public static void main(String[] args) {
        Object[] objects=new Object[4];// references to the array object is created
        for(int i=0;i<4;i++)
        {
            System.out.println(objects[i]);
        }

        for(int i=0;i<4;i++)
        {
            objects[i]=new Person("name"); // references into the array object is created

        }
        for(Object person:objects)
        {
            System.out.println(person);
        }
    }
}
