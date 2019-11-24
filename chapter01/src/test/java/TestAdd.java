import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestAdd {

    private Add add;

    @Before
    public void before() {
        add = new Add();
    }

    @Test
    public void testAdd01() {
        int sum = add.add(1, 2);
        Assert.assertEquals(3, sum);
    }

    @Test
    public void testAdd02() {
        int r = add.add(2, 2);
        Assert.assertEquals(4, r);
    }
}
