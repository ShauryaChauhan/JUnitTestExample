import org.junit.Test;

import static org.junit.Assert.*;

public class jUnitTestingTest1 {
    @Test
    public void addStrings() throws Exception {
        jUnitTesting jUnit=new jUnitTesting();
        String result=jUnit.addStrings("lab","seven");
        assertEquals("labseven",result);
    }

}