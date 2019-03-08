package za.ac.cput.demospring;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

public class CourseTest {

    private Course course,course1;
    private Course degree;
    private ArrayList<Subject> subjects;

    @Before
    public void setUp() throws Exception {
        subjects = new ArrayList<>();
        subjects.add(new Subject.Builder().subId(122).name("Communication Network").isCompulsory(false).build());
        subjects.add(new Subject.Builder().subId(123).name("Multimedia").isCompulsory(false).build());
        subjects.add(new Subject.Builder().subId(122).name("Project Management").isCompulsory(false).build());
        subjects.add(new Subject.Builder().subId(122).name("Professional Practise").isCompulsory(false).build());
        course = new Course
                .Builder()
                .courseNum(214)
                .name("Information Technology")
                .duration("3 years")
                .subjects(subjects)
                .build();
        course1 = new Course
                .Builder()
                .courseNum(214)
                .name("Information Technology")
                .duration("3 years")
                .subjects(subjects)
                .build();
    }

    @Ignore
    @Test
    public void getCourseNum() {
        Assert.assertEquals(course.getCourseNum(),215);
    }


    @Test(expected = AssertionError.class)
    public void getName() {
        Assert.assertEquals(course.getName(),"Information Technology");
    }


    @Test(timeout = 10000)
    public void getSubjects() {
        Assert.assertEquals(course.getSubjects(),null);while (true);
    }


    @Test
    public void getDuration() {
        Assert.assertEquals(course.getDuration(),"3 years");
    }
    @Test
    public void testObjectEquality(){

        Assert.assertEquals(course1,course);
    }
    /*
     * this test tests object identity
     * it also has a timeout,that is it will give error after the elapsed time expires*/
    @Test(timeout = 10000)
    public void testObjectIdentity(){

        course1 = course;
        Assert.assertSame(course1,course);
        while (true);
    }
}