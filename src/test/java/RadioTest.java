import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    private Radio radio;

    @Before
    public void before(){
        radio = new Radio("MFR", "Goodmans", "Canvas DAB");
    }

    @Test
    public void canTuneToRadioStation(){
        assertEquals("MFR", radio.tune());
    }

    @Test
    public void canGetMake() {
        assertEquals("Goodmans", radio.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Canvas DAB", radio.getModel());
    }
}
