import lab3.utils.HitChecker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class HitCheckerTest {
    private HitChecker hitChecker;

    @Before
    public void init() {
        hitChecker = new HitChecker();
    }


    @Test
    public void first(){
        assertFalse(hitChecker.checkArea(1, 1, 5));
    }
}