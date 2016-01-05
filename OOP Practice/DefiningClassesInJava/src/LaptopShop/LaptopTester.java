package LaptopShop;

import LaptopShop.Models.Battery;
import LaptopShop.Models.Laptop;

public class LaptopTester {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("model",456.9);
        System.out.println(laptop);

        Battery battery = new Battery("Li-Ion, 4-cells, 2550 mAh", -4.5);
        System.out.println(battery);
    }
}
