package AC;

public class AirConditioner {
    private  boolean isOn ;
    private  String productName;
    private int temperature;

    public AirConditioner(String productName){
        this.productName = productName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean state){
        temperature = 16;
        isOn = state ;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setTemperature(int temperatureNumber) {
        if (temperatureNumber < 16) temperature = 16 ;
        else if (temperatureNumber > 30) temperature = 30 ;
        else temperature = temperatureNumber;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getProductName() {
        return productName;
    }

    public void increaseTemperature(){
        if (temperature > 30) temperature = 30 ;
        else {
            temperature++ ;
        }
    }

    public void decreaseTemperature(){
        if (temperature < 16) temperature =16 ;
        else{
            temperature-- ;
        }
    }


}
