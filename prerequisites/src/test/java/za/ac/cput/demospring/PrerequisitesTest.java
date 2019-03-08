package za.ac.cput.demospring;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrerequisitesTest {

    private Prerequisites prerequisites;
    @Before
    public void setUp() throws Exception {
        prerequisites = new Prerequisites.Builder().prereqs("Previous year subject").build();
    }

    @Test
    public void getPrereqs() {
        Assert.assertEquals(prerequisites.getPrereqs(),prerequisites.getPrereqs());
    }
}