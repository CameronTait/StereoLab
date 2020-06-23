public class RecordDeck {

    private String playSpeed;
    private String recordSize;
    private String make;
    private String model;

    public RecordDeck(String playSpeed, String recordSize, String make, String model) {
        this.playSpeed = playSpeed;
        this.recordSize = recordSize;
        this.make = make;
        this.model = model;
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

    public String getModel(){
        return model;
    }


}