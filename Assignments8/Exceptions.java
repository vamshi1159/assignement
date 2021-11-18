package Assignments.Assignments8;

class InValidLengthException extends Exception
{
    public String getMessage()
    {
        return "name should be atleast 6 letter";
    }
}
class InvalidAgeException extends Exception
{
    public String getMessage()
    {
        return "age should be greater than 18";
    }
}
class InvalidCharException extends Exception
{
    public String getMessage()
    {
        return "Enter either M or F";
    }
}
