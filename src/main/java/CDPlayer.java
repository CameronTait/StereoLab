public class CDPlayer {

    private int numberOfCds;
    private String make;

    public CDPlayer(int numberOfCds, String make){
        this.numberOfCds = numberOfCds;
        this.make = make;
    }

    public int getNumberOfCds(){
        return numberOfCds;
    }

    public String getMake(){
        return make;
    }

}
