package PCCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PCCatalogTester {
    public static void main(String[] args) {

        Component ram = new Component("RAM", 23.69);
        Component cd = new Component("CD", "too expensive", 234.5);
        List<Component> partsFuirst = new ArrayList<>();
        partsFuirst.add(cd);
        partsFuirst.add(ram);

        List<Component> partsSecond = new ArrayList<>();
        Component cpu = new Component("CPU", 124.67);
        Component ram2 = new Component("RAM", 123.23);
        partsSecond.add(cpu);
        partsSecond.add(ram2);

        List<Component> partsForth = new ArrayList<>();
        Component cpu2 = new Component("CPU", 1234.78);
        partsForth.add(cpu2);

        //Computer computerThree = new Computer("Lenovo"); -> test

        Computer computerOne = new Computer("HP", partsFuirst);
        Computer computerTwo = new Computer("Mac", partsSecond);
        Computer computerFour = new Computer("The best", partsForth);

        List<Computer> computers = new ArrayList<>();
        computers.add(computerOne);
        computers.add(computerTwo);
        computers.add(computerFour);

        //!!! sorting problem!

        List<Computer> sortedComputers = computers
                .stream()
                .sorted((comp1, comp2) -> Double.compare(comp1.getPrice(), comp2.getPrice()))
                .collect(Collectors.toList());

        for(Computer computer : sortedComputers){
            System.out.println(computer);
        }
    }
}

