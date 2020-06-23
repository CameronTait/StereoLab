import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    private Radio radio;

    @Before
    public void before(){
        radio = new Radio("MFR");
    }

    @Test
    public void canTuneToRadioStation(){
        assertEquals("MFR", radio.tune());
    }

}
