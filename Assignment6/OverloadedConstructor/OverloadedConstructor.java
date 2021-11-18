package Assignments.Assignment6.OverloadedConstructor;

public class OverloadedConstructor {
    String firstname,lastname;
   public OverloadedConstructor(String firstname,String lastname)
    {
        this(lastname);
        this.firstname=firstname;
        System.out.println("invoked two argument constructor");
    }

    public OverloadedConstructor(String lastname) {
        System.out.println("invoked one argument constructor");
       this.lastname=lastname;
    }
}
