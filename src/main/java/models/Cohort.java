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
        ArrayList<Pairing> pairs = new ArrayList<>();
        int timesToLoop = this.students.size() / 2;
        for (int i = 0; i < timesToLoop; i++) {
            pairs.add(new Pairing(getPair()));
            this.students.remove(0);
            this.students.remove(0);
        }
        return pairs;
    }

}
