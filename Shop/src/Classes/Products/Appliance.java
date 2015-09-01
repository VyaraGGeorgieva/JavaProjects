package Classes.Products;


import Classes.Shop.Classes.Enums.AgeRestriction;

public class Appliance extends ElectronicsProduct {
    private static final int GUARANTEE_PERIOD = 6;

    public Appliance(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction, GUARANTEE_PERIOD);
    }
}
