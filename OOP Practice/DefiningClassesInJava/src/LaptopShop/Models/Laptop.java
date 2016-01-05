package LaptopShop.Models;

public class Laptop {

    //fields:
    private String model;
    private double price;
    private String manufacturer;
    private String processor;
    private String RAM;
    private String graphicsCard;
    private String HDD;
    private String screen;
    private Battery battery;


    //properties
    public  String getModel(){
        return this.model;
    }
    private void setModel(String model){
        if (this.model == null){
            throw new IllegalArgumentException("The model should be specified!");
        }
        else{
            this.model = model;
        }
    }

    public double getPrice(){
        return this.price;
    }

    private void setPrice(double price){
        if (this.price<=0){
            throw new IllegalArgumentException("The price canot be below or equal to 0.");
        }
        else{
            this.price = price;
        }
    }

    //constructors
    public Laptop(String model,double price , String processor, String RAM, String graphicsCard, String screen, String HDD, Battery battery, String manufacturer) {
        this.setModel(model);
        this.setPrice(price);
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.RAM = RAM;
        this.graphicsCard = graphicsCard;
        this.screen = screen;
        this.HDD = HDD;
        this.battery = battery;

    }

    public Laptop(String model, double price){
        this(model, price, null, null, null, null, null, null, null);
    }

    public Laptop(String model, double price, String processor){
        this(model, price, processor, null, null, null, null, null, null);
    }

    @Override

    public String toString(){
        return String.format(
                "Model: "+this.getModel()+
                        " Price: " + this.getPrice());
    }
}
