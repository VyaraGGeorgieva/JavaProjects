package PCCatalog;

import java.util.List;

public class Computer  {

    //fields
    private String name;
    private List<Component> components;

    //getter-setter properties
    public String getName() {
        return this.name;
    }

    private void setName(String nameProp) {
        if (nameProp.length() < 2) {
            throw new IllegalArgumentException("The name should be at least 2 characters long");
        }
        this.name = nameProp;
    }


    public List<Component> getComponenets() {
        return this.components;
    }

    private void setComponents(List<Component> componentsProp) {
        this.components = componentsProp;
    }

    public double getPrice(){
        return CalculatePrice(this);
    }

    //constructors
    public Computer(String name, List<Component> components) {
        this.setName(name);
        this.setComponents(components);
    }

    public Computer(String name) {
        this(name, null);
    }


    //methods
    public static double CalculatePrice(Computer computer){
          List<Component> components = computer.getComponenets();
        double price = 0.0;
        for(Component component : components){
            price+=component.getPrice();
        }
        return price;
    }


    @Override
    public String toString() {
        String output = "Computer's name: ";
        if(this.components==null){
            output+= this.getName() + "\n";
            output+= "No components available";
        }
        else{
            output+= this.getName() + "\n";
            output += "Computer's components: " + "\n";
            for(Component component: this.getComponenets()){
                if(component.getDescription()==null){
                    output += "Part's name: " + component.getName() + "\n";
                    output += "Part's price: " + component.getPrice() +  "\n";
                }
                else{
                    output += "Part's name: " + component.getName() + "\n";
                    output+= "Part's description: " + component.getDescription() + "\n";
                    output += "Part's price: " + component.getPrice() + "\n";
                }
            }
            output+= "Total price: ";
            output+= this.getPrice();
        }
        return output;
    }
}
