import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSub {
    private Sub sub;

    @Before
    public void before() {
        sub = new Sub();
    }

    @Test
    public void testSub() {
        int r = sub.sub(2, 1);
        Assert.assertEquals(1, r);
    }
}
