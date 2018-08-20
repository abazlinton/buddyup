package models;

import java.util.ArrayList;
import java.util.List;

public class Pairing {

    private List<Student> students;

    public Pairing(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getFirstStudentName(){
        return this.students.get(0).getName();
    }

    public String getSecondStudentName(){
        return this.students.get(1).getName();
    }


}
