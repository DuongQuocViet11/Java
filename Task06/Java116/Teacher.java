package Task06.Java116;

public class Teacher extends Person{
    private int numCourses;
    private String[] courses;
    private static final int MAX_COURSES = 5;

    public Teacher (String name, String address){
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

    public boolean addCourse(String course){
        boolean found = false;
        // Look for the course index
        int courseIndex = -1; // need to initialize
        for (int i = 0; i < numCourses; i++){
            if (courses[i].equals(course)){
                courseIndex = i;
                found = true;
                break;
            }
        }
        if (found){
            for (int i = courseIndex; i < numCourses-1; i++){
                courses[i] = courses[i+1];
            }
            numCourses--;
            return true;
        }else {
            return false;
        }
    }
}
