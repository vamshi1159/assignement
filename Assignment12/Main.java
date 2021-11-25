package Assignments.Assignment12;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
   public static  List<Student> studentList;
    public static void main(String[] args) {
        LoadStudents();
        //1. Print the name of all departments in the college?
        Stream<String> departmentsStream =studentList
                                            .stream()
                                            .map(Student::getEngDepartment)
                                            .distinct();
        System.out.println("1. Print the name of all departments in the college?");
        departmentsStream.forEach(System.out::println);

        //2.Get the names of all students who have enrolled after 2018?
        Stream<String> enrolledAfter2018=studentList
                                            .stream()
                                            .filter(student -> student.getYearOfEnrollment()>2018)
                                            .map(Student::getStudentName);
        enrolledAfter2018.forEach(System.out::println);

        //3. Get the details of all male student in the computer sci department?
        Stream<Student> MaleStudents_ComputerDpt=studentList.stream()
                                                 .filter(student -> {return student.getStudentGender().equalsIgnoreCase("male") && student.getEngDepartment().equalsIgnoreCase("Computer Science");});
        System.out.println("\n 3. Get the details of all male student in the computer sci department?");

        //4. How many male and female student are there ?
        System.out.println("How many male and female student are there ?");
        Map<String,List<Student>> countByGender = studentList
                                                    .stream()
                                                    .collect(Collectors.groupingBy(Student::getStudentGender));
        System.out.println("no of Male Students "+countByGender.get("Male").size()+
                "\nno of Male Students "+countByGender.get("Male").size() );

        //     5.What is the average age of male and female students
        System.out.println("\n 5.What is the average age of male and female students");
        OptionalDouble maleAverage = countByGender.get("Male")
                                        .stream()
                                        .mapToDouble(Student::getStudentAge)
                                        .average();
        OptionalDouble femaleAverage = countByGender.get("Female")
                                        .stream()
                                        .mapToDouble(Student::getStudentAge)
                                        .average();
        System.out.println("Avg age of Male : "+maleAverage.getAsDouble()+"\nAvg age of Female : "+femaleAverage.getAsDouble());


        //6. Get the details of  highest percentage
        System.out.println("Get the details of  highest percentage");
        OptionalDouble studentWithHighPercentage = studentList.stream()
                                                    .mapToDouble(Student::getPercentageTillDate)
                                                    .max();
        System.out.println("Highest percentage is : "+studentWithHighPercentage.getAsDouble());


        //7.Count the number of students in each department?
        System.out.println("\n7.Count the number of students in each department ");
        Map<String,List<Student>> DeptWiseStudents = studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment));
                for(String dept : DeptWiseStudents.keySet()){
                    System.out.println(dept+" : "+DeptWiseStudents.get(dept).size());
                }

        //8. What is the average percentage achieved in each department?
        System.out.println("\n8.Average percentage of each department : ");
                for (String dept : DeptWiseStudents.keySet()){
                    System.out.println(dept+" : "+DeptWiseStudents.get(dept)
                                                    .stream()
                                                    .mapToDouble(Student::getPercentageTillDate)
                                                    .average().getAsDouble());
                }

        //9.Get the details of youngest male student in the Electronic department?
        System.out.println("\n9.The youngest male student in Electronic department is : ");
        Optional<Student> youngestMaleStudent = studentList.stream()
                        .filter(student->student.getStudentGender().equalsIgnoreCase("Male"))
                        .filter(student->student.getEngDepartment().equalsIgnoreCase("Electronic"))
                        .min((a,b)->a.getStudentAge()>b.getStudentAge()?1:-1);
        youngestMaleStudent.stream().map(Student::getStudentName).forEach(System.out::println);

        //10.How many male and female students are there in the computer science department?
        System.out.println("\n10.How many male and female students are there in the computer science department?");
        Map<String,List<Student>> maleFemaleCse = studentList
                                                    .stream()
                                                    .filter(student -> student.getEngDepartment().equals("Computer Science"))
                                                    .collect(Collectors.groupingBy(Student::getStudentGender));
        System.out.println("\nMale : "+maleFemaleCse.get("Male").stream().count()+"\nFemale : "+maleFemaleCse.get("Female").stream().count());
    }














    public static void LoadStudents()
    {
        studentList=new ArrayList<>();
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male","Electrical",2018,80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
    }
}
