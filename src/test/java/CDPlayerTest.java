import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    private CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer(5, "Bose", "Wave");
    }

    @Test
    public void canGetNumberOfCds(){
        assertEquals(5, cdPlayer.getNumberOfCds());
    }

    @Test
    public void canGetMake(){
        assertEquals("Bose", cdPlayer.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Wave", cdPlayer.getModel());
    }

}
