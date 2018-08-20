import models.Pairing;
import models.Student;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class PairingTest {

    @Test
    public void canMakePairing(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Emil"));
        students.add(new Student("Mark"));
        Pairing pairing = new Pairing(students);
        assertEquals(2, pairing.getStudents().size());
    }
}
