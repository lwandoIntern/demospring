package za.ac.cput.demospring;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CodeTest {

    private Code code;
    @Before
    public void setUp() throws Exception {
        code =new Code.Builder().codeCourse("ITS362S").build();
    }

    @Test
    public void getCodeCourse() {
        Assert.assertEquals(code.getCodeCourse(),code.getCodeCourse());
    }
}