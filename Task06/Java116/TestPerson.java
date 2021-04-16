package Task06.Java116;

public class TestPerson {
    public static void main(String[] args) {
        // Test Student class
        Student s1 = new Student("Tan Ah Teck", "1 Happy Ave");
        s1.addCourseGrade("IM101", 97);
        s1.addCourseGrade("IM102", 68);
        s1.printGrades();
        // Student: Tan Ah Teck (1 Happy Ave) IM101:97 IM102:68
        System.out.println("Average is " + s1.getAverageGrade());

        //Test Teacher class
        Teacher t1 = new Teacher("Paul Tan", "8 sunset way");
        System.out.println(t1);
        String[] courses = {"IM101", "IM102", "IM101"};
        for (String course: courses){
            if (t1.addCourse(course)){
                System.out.println(course + " added");
            }else {
                System.out.println(course + " cannot be added");
            }
        }
        //IM101 added
        //IM102 added
        //IM101 cannot be added

    }
}
