import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    private Stereo stereo;
    private RecordDeck recordDeck;
    private CDPlayer cdPlayer;
    private Radio radio;

    @Before
    public void before(){
        stereo = new Stereo(recordDeck, cdPlayer, radio, "Super Duper Stereo SoundSystem");
        recordDeck = new RecordDeck ("Sony", "PS-HX500", "33 RPM", "12 Inch");
    }

    @Test
    public void canGetStereoName(){
        assertEquals("Super Duper Stereo SoundSystem", stereo.getName());
    }

    @Test
    public void canGetRecordDeck(){
        assertEquals(recordDeck, stereo.getRecordDeck());
    }
}
