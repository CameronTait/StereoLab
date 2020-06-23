public class CDPlayer {

    private int numberOfCds;
    private String make;
    private String model;

    public CDPlayer(int numberOfCds, String make, String model){
        this.numberOfCds = numberOfCds;
        this.make = make;
        this.model = model;
    }

    public int getNumberOfCds(){
        return numberOfCds;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

}
