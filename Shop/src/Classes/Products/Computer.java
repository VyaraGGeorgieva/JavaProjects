package Classes.Products;

import Classes.Shop.Classes.Enums.AgeRestriction;


public class Computer extends ElectronicsProduct {
    private static final int GUARANTEE_PERIOD = 24;
    public Computer(String name, double price, int quantity, AgeRestriction ageRestriction) {

        super(name, price, quantity, ageRestriction,GUARANTEE_PERIOD);
    }
}
