package ie.atu.productv5;

public class Tv extends Product {

    private String screenSize;
    private String manufacturer;

    public Tv() {
        super();
        screenSize = "";
        manufacturer="";
        count++;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String manufacturer(){
        return manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + " \nscreen size " + screenSize + "\nManufactured By " + manufacturer;
    }
}
