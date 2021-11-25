package Assignments.Assignment12;

public class Student {
    int studentId;
    String studentName;
    int studentAge;
    String studentGender;
    String engDepartment;
    int yearOfEnrollment;
    double percentageTillDate;

    public Student(int studentId, String studentName, int studentAge,
                   String studentGender, String engDepartment,
                   int yearOfEnrollment, double percentageTillDate) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.percentageTillDate = percentageTillDate;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public double getPercentageTillDate() {
        return percentageTillDate;
    }
}
