package za.ac.cput.demospring;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    private Student student,student1;

    @Before
    public void setUp() throws Exception {
        student = new Student.Builder().studentId(1).name("NCEBA").surname("SCOTT").address("13 GERANIUM STREET").zipCode("7441").build();
        student1 = new Student.Builder().studentId(1).name("NCEBA").surname("SCOTT").address("13 GERANIUM STREET").zipCode("7441").build();
    }

    @Test
    public void getStudentId() {
        assertEquals(student.getStudentId(),student.getStudentId());
    }

    @Test
    public void getName() {
        assertEquals(student.getName(),student.getName());
    }

    @Test
    public void getSurname() {
        assertEquals(student.getSurname(),student.getSurname());
    }

    @Test
    public void getAddress() {
        assertEquals(student.getAddress(),student.getAddress());
    }

    @Test(expected = AssertionError.class)
    public void getZipCode() {
        assertEquals(student.getZipCode(),student.getZipCode());
    }
    @Test(timeout = 10000)
    public void testObjectEquality(){

        assertEquals(student,student1);
    }
    /*
     * this test tests object identity
     * it also has a timeout,that is it will give error after the elapsed time expires*/
    @Test(timeout = 10000)
    public void testObjectIdentity(){

        student1 = student;
        Assert.assertSame(student,student1);
        while (true);
    }
}