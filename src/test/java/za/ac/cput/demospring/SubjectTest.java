package za.ac.cput.demospring;

import org.junit.*;

import static org.junit.Assert.*;

public class SubjectTest {

    private Subject subject;
    private Subject subject1;
    @Before
    public void setUp() throws Exception {
        subject = new Subject
                .Builder()
                .subId(1005)
                .name("Information Systems 3")
                .duration("1 year")
                .isCompulsory(true)
                .build();
        subject1 = new Subject.Builder()
                .subId(1005)
                .isCompulsory(true)
                .name("Information Systems 3")
                .duration("1 year")
                .build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = AssertionError.class)
    public void getSubId() {
        assertEquals(subject.getSubId(),1005);
    }

    @Test
    public void getName() {
        assertEquals(subject.getName(),"Information Systems 3");
    }


    @Test
    public void isCompulsory() {
        assertEquals(subject.isCompulsory(),true);
    }

    @Test
    public void getDuration() {
        assertEquals(subject.getDuration(),"1 year");
    }

    /*
     *this method tests object equality, that is, they are of similar/equal values
     * however, because of the ignore annotation this test's results won't matter
     */
    @Ignore
    @Test
    public void testObjectEquality(){

        assertEquals(subject,subject1);
    }
    /*
     * this test tests object identity
     * it also has a timeout,that is it will give error after the elapsed time expires*/
    @Test(timeout = 10000)
    public void testObjectIdentity(){

        subject1 = subject;
        Assert.assertSame(subject1,subject);
        while (true);
    }

}