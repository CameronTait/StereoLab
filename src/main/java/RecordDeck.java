public class RecordDeck extends Component {

    private String playSpeed;
    private String recordSize;


    public RecordDeck(String make, String model, String playSpeed, String recordSize) {
        super(make, model);
        this.playSpeed = playSpeed;
        this.recordSize = recordSize;
    }
    
    public String getPlaySpeed() {
        return playSpeed;
    }

    public String getRecordSize() {
        return recordSize;
    }



}