package Practice2;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> myStudent;

    public StudentList(){
        this.myStudent = new ArrayList<Student>();
    }

    public boolean addNewStudent(Student student){
        if(findStudent(student.getStudentName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        myStudent.add(student);
        return true;
    }

    private int findStudent(Student student) {
        return this.myStudent.indexOf(student);
    }

    private int findStudent (String studentName){
        for (int i = 0; i < this.myStudent.size(); i++){
            Student student = this.myStudent.get(i);
            if (student.getStudentName().equals(studentName)){
                return i;
            }
        }
        return -1;
    }
}
