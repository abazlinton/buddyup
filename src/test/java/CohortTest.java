import models.Cohort;
import models.Pairing;
import models.Student;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


public class CohortTest {


    @Test
    public void hasName(){
        Cohort cohort = new Cohort("E23");
        assertEquals("E23", cohort.getName());
    }

    @Test
    public void canAddStudents(){
        Student mark = new Student("Mark");
        Student pat = new Student("Pat");
        Cohort cohort = new Cohort("E23");
        cohort.addStudent(mark);
        cohort.addStudent(pat);
        assertEquals(   2, cohort.getStudents().size());
    }

    @Test
    public void canGetRandomStudent(){
        Student marcin = new Student("Marcin");
        Cohort cohort = new Cohort("E23");
        cohort.addStudent(marcin);
        assertEquals("Marcin", cohort.getRandomStudent().getName());
    }

    @Test
    public void canGetPairOfStudents(){
        Student marcin = new Student("Marcin");
        Student pat = new Student("Pat");
        Student mark = new Student("Mark");
        Cohort cohort = new Cohort("E23");
        cohort.addStudent(marcin);
        cohort.addStudent(pat);
        cohort.addStudent(mark);
        ArrayList<Student> pair = (ArrayList) cohort.getPair();
        assertEquals(2, pair.size());
    }

    @Test
    public void canGetPairsOfStudents(){
        Student marcin = new Student("Marcin");
        Student pat = new Student("Pat");
        Student mark = new Student("Mark");
        Student emil = new Student("Emil");
        Cohort cohort = new Cohort("E23");
        cohort.addStudent(marcin);
        cohort.addStudent(pat);
        cohort.addStudent(mark);
        cohort.addStudent(emil);
        ArrayList<Pairing> pairs = (ArrayList) cohort.getPairs();
        assertEquals(2, pairs.size());
        assertEquals(2, pairs.get(0).getStudents().size());
        assertEquals(2, pairs.get(1).getStudents().size());
    }




}
