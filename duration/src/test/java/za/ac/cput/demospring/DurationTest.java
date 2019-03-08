package za.ac.cput.demospring;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DurationTest {

    private Duration duration;
    @Before
    public void setUp() throws Exception {
        duration = new Duration.Builder().duration("6 months").build();
    }

    @Test
    public void getDuration() {
        Assert.assertEquals(duration.getDuration(), duration.getDuration());
    }
}