package PCCatalog;

public class Component {
    private String name;
    private String description;
    private double price;

    public String getName(){
        return this.name;
    }
    public void setName(String nameProp){
        if(nameProp.length()<2){
            throw new IllegalArgumentException("The name should be at least 2 characters");
        }
        this.name = nameProp;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String descriptionProp){
        if(!(descriptionProp==null) && descriptionProp.length()<2){
            throw new IllegalArgumentException("The description should be at least 2 characters");
        }
        this.description = descriptionProp;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double priceProp){
        if(priceProp<=0){
            throw new ArithmeticException("The price should be a positive number!");
        }
        this.price = priceProp;
    }

    public Component(String name, String description, double price){
        this.setName(name);
        this.setDescription(description);
        this.setPrice(price);
    }
    public Component(String name, double price){
        this(name, null, price);
    }


}
