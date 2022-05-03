import lab3.utils.HitChecker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HitCheckerTest {
    private HitChecker hitChecker;

    @Before
    public void init() {
        hitChecker = new HitChecker();
    }


    @Test
    public void first(){
        assertEquals(hitChecker.checkArea(1, 1, 5), true);
    }

    @Test
    public void second(){
        assertEquals(hitChecker.checkArea(-4, 2, 10), true);
    }
}