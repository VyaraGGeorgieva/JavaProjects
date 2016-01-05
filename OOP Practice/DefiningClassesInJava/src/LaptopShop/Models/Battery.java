package LaptopShop.Models;

public class Battery {
    private String description;
    private double batteryLife;

    public Battery(String description, double batteryLife){
        this.batteryLife = batteryLife;
        this.description = description;
    }

    public  String getDescription(){
        return this.description;
    }

    public double getBatteryLife(){
        return this.batteryLife;
    }

    private void setBatteryLife( double batteryLife){
        if(batteryLife<=0){
            throw new IllegalArgumentException("The battery Life should be more than 0");
        }
        else{
            this.batteryLife = batteryLife;
        }
    }

    @Override
    public String toString(){
        return String.format("Battery's description: " + this.getBatteryLife() +
        " Battery's life duration: " + this.getBatteryLife());
    }
}
