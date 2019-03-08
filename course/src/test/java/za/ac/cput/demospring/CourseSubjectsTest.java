package za.ac.cput.demospring;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import javax.security.auth.Subject;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CourseSubjectsTest {

    private CourseSubjects courseSubjects;
    private ArrayList<String> values;
    @Before
    public void setUp() throws Exception {
        values = new ArrayList<>();
        values.add("ITS 3");
        values.add("ADP 3");
        values.add("PRM 3");
        values.add("ADT 3");
        values.add("ICE 3");

        courseSubjects = new CourseSubjects.Builder().courseSubject(values).build();
    }

    @Test
    public void getSubjects() {
        Assert.assertEquals(courseSubjects.getSubjects(),courseSubjects.getSubjects());
    }
}