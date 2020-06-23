import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {
    private RecordDeck recordDeck;

    @Before
    public void before() {
        recordDeck = new RecordDeck ("33 RPM", "12 Inch", "Sony");
    }

    @Test
    public void canGetPlaySpeed() { assertEquals ( "33 RPM", recordDeck.getPlaySpeed());}

    @Test
    public void canGetRecordSize(){
        assertEquals("12 Inch", recordDeck.getRecordSize());
    }

    @Test
    public void canGetRecordDeckMake(){
        assertEquals("Sony", recordDeck.getRecordDeckMake());
    }
}

