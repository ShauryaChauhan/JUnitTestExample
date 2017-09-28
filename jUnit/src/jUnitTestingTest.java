import static org.junit.Assert.*;

public class jUnitTestingTest {
    @org.junit.Test
    public void addNumbers() throws Exception {
        jUnitTesting jUnit=new jUnitTesting();
        int result=jUnit.addNumbers(101,201);
        assertEquals(302,result);

    }

}