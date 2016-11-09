import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JongKwang on 10/11/2016.
 */
public class CalculatorTest {
    @Test
    public void sum() throws Exception {
        Calculator c = new Calculator();
        assertEquals(c.sum(1,2), 3);
    }

    @Test
    public void sum2() throws Exception {
        Calculator c = new Calculator();
        assertEquals(c.sum(2,3), 6);
    }

}