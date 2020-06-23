public class Stereo {

    private RecordDeck recordDeck;
    private CDPlayer cdPlayer;
    private Radio radio;

    private String name;
    private int volume;

    public Stereo(RecordDeck recordDeck, CDPlayer cdPlayer, Radio radio, String name){
        this.recordDeck = recordDeck;
        this.cdPlayer = cdPlayer;
        this.radio = radio;
        this.name = name;
        this.volume = volume;
    }

    public String getName(){
        return name;
    }

    public RecordDeck getRecordDeck() {
        return this.recordDeck;
    }
}
