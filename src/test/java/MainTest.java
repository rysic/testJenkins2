import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void adder() {
        Main maintest = new Main();
        assertEquals(10, maintest.adder(5,5));
    }
}