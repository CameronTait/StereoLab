public class Radio {

    private String station;
    private String make;
    private String model;

    public Radio(String station, String make, String model){
        this.station = station;
        this.make = make;
        this.model = model;
    }

    public String tune(){
        return station;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }
}
