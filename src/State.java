public class State {
    String shortcut;
    String name;
    double VAT;
    double lowVAT;
    boolean parkingRate;

    public State(String shortcut, String name, double VAT, double lowVAT, boolean parkingRate){
        this.shortcut = shortcut;
        this.name = name;
        this.VAT = VAT;
        this.lowVAT = lowVAT;
        this.parkingRate = parkingRate;
    }

}
