package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cohort {


    private List<Student> students;
    private String name;


    public Cohort(String name) {
        this.students = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getRandomStudent(){
        Collections.shuffle(this.students);
        return this.students.get(0);

    }

    public List<Student> getPair(){
        Collections.shuffle(this.students);
        ArrayList<Student> pair = new ArrayList<>();
        pair.add(this.students.get(0));
        pair.add(this.students.get(1));
        return pair;
    }

    public List<Pairing> getPairs(){
        Collections.shuffle(this.students);
        ArrayList<Pairing> pairs = new ArrayList<>();
        int noOfStudents = this.students.size();
        for ( int i = 0; i < noOfStudents; i += 2 ) {
            ArrayList<Student> pairOfStudents = new ArrayList<>(2);
            // 0, 2, 4...
            pairOfStudents.add(this.students.get(i));
            // 1, 3, 5...
            pairOfStudents.add(this.students.get(i + 1));
            pairs.add(new Pairing(pairOfStudents));
        }
        return pairs;
    }

}
