package Classes.Products;


import Classes.Shop.Classes.Enums.AgeRestriction;

public class ElectronicsProduct extends Product {

    public int guaranteePeriod;

    public ElectronicsProduct(String name, double price, int quantity, AgeRestriction ageRestriction, int guaranteePeriod ) {
        super(name, price, quantity, ageRestriction);
        this.guaranteePeriod = guaranteePeriod;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }

    @Override
    public String toString() {
        return "Electronics product: " + this.getName()
                + " price: " + this.getPrice().doubleValue() +
                " age restriction: " + this.getAgeRestriction().toString().toLowerCase();
    }
}
