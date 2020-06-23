import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {
    private RecordDeck recordDeck;

    @Before
    public void before() {
        recordDeck = new RecordDeck ("Sony", "PS-HX500", "33 RPM", "12 Inch");
    }

    @Test
    public void canGetPlaySpeed() { assertEquals ( "33 RPM", recordDeck.getPlaySpeed());}

    @Test
    public void canGetRecordSize(){
        assertEquals("12 Inch", recordDeck.getRecordSize());
    }

    @Test
    public void canGetRecordDeckMake(){
        assertEquals("Sony", recordDeck.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("PS-HX500", recordDeck.getModel());
    }
}

