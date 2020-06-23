public class RecordDeck {

    private String playSpeed;
    private String recordSize;
    private String make;

    public RecordDeck(String playSpeed, String recordSize, String make) {
        this.playSpeed = playSpeed;
        this.recordSize = recordSize;
        this.make = make;
    }
    
    public String getPlaySpeed() {
        return playSpeed;
    }

    public String getRecordSize() {
        return recordSize;
    }

    public String getRecordDeckMake() {
        return make;
    }


}