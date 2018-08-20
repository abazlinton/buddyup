import models.Student;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StudentTest {


    @Test
    public void studentHasName(){
        Student student = new Student("Alex");
        assertEquals("Alex", student.getName());
    }

}
