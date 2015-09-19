import Classes.People.Customer;
import Classes.Products.Computer;
import Classes.Products.ElectronicsProduct;
import Classes.Products.FoodProduct;
import Classes.Products.Product;
import Classes.Shop.Classes.Enums.AgeRestriction;

import java.math.BigDecimal;
import java.security.InvalidParameterException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TestingData {

    public static class PurchaseManager{
        public static void processPurchase (Customer customer, Product product)
            throws ParseException{
            if (product.getQuantity()<=0){
                throw new IllegalArgumentException("The shop has run out of this procuct");
            }

            if (product instanceof FoodProduct){
                Date today = new Date();
                Date dateToExpire = ((FoodProduct)product).getExpirationDate();
                if (today.getTime()>dateToExpire.getTime()){
                    throw new InvalidParameterException("The date has expired!");
                }
            }

            if (product.getPrice().doubleValue()>customer.getBalance().doubleValue()) {
                throw  new ArithmeticException("The customer does not have enpough money for the purchase");
            }

            if ((customer.getAge()<18) && product.getAgeRestriction().equals(AgeRestriction.ADULT)){
                throw new IllegalStateException("The customer needs to be full of age, he does not have the right to buy the product");
            }

            if ((customer.getAge()<13) && product.getAgeRestriction().equals(AgeRestriction.TEENAGER)){
                throw new IllegalStateException("The customer needs to be at least 13 to be able to buy this product");
            }

            BigDecimal newBalance = customer.getBalance().subtract(product.getPrice());
            customer.setBalance(newBalance);
            int newQuantity = product.getQuantity()-1;
            product.setQuantity(newQuantity);
            }
        }


    public static void main(String[] args) throws ParseException {

        FoodProduct bread = new FoodProduct("bread", 1.85, 20,
                AgeRestriction.NONE, "11/10/2015");
        Computer dell = new Computer("dell", 250, 6, AgeRestriction.ADULT);
        Customer marina = new Customer("Marina", 12, 120.63);

        System.out.println("Before shopping: ");
        System.out.println(bread.getName() + " quantity: "
                + bread.getQuantity());
        System.out.println(marina.getName() + " balance is: "
                + marina.getBalance().doubleValue());

        try {
            PurchaseManager.processPurchase(marina, bread);

        } catch (InvalidParameterException e) {
            System.out.println("Expired product");
        } catch (IllegalArgumentException e) {
            System.out.println("Quantity can't be zero or less");
        } catch (ArithmeticException e) {
            System.out.println("Customer's balance is not enough");
        } catch (IllegalStateException e) {
            System.out
                    .println("Customer doesn't have permissions for this product");
        }

        System.out.println("After shopping: ");
        System.out.println(bread.getName() + " quantity: "
                + bread.getQuantity());
        System.out.println(marina.getName() + " balance is: "
                + marina.getBalance().doubleValue());
        System.out.println();
        System.out.println("New shopping laptop dell");
        try {
            PurchaseManager.processPurchase(marina, dell);

        } catch (InvalidParameterException e) {
            System.out.println("Expired product!");
        } catch (IllegalArgumentException e) {
            System.out.println("This product is no longer available!");
        } catch (ArithmeticException e) {
            System.out
                    .println("You do not have enough money to buy this product!");
        } catch (IllegalStateException e) {
            System.out.println("You are too young to buy this product!");
        }
        System.out.println();

        Product milk = new FoodProduct("Aktivia", 1.00, 5, AgeRestriction.NONE, "09.10.2015");
        Product tvSet = new ElectronicsProduct("Samsung", 567.00, 1, AgeRestriction.TEENAGER, 6);

        List<Product> products = new ArrayList<Product>();
        products.add(bread);
        products.add(dell);
        products.add(milk);
        products.add(tvSet);

        Comparator<Product> compareByPrice =
                (p1, p2) -> p1.getPrice()
                        .compareTo(p2.getPrice());

        List<Product> ageRestrictedProducts = products.stream()
                .filter(p->p.getAgeRestriction()!= AgeRestriction.NONE)
                .sorted(compareByPrice).collect(Collectors.toList());

        System.out.println("The restricted products, sorted by price: ");
       for (Product product : ageRestrictedProducts){
           System.out.println(product + " ");

       }
    }
    }




