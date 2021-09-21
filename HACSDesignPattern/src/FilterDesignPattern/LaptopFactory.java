package FilterDesignPattern;

import FilterDesignPattern.model.Laptop;

import java.util.List;

public class LaptopFactory {
//    int id, String hardDisk, String processor, String ram,
//    String operatingSystem, String screenSize

    public static List<Laptop> manufactureInBulk() {
        return List.of(
                new Laptop(200,"HDD 250","I5","1 GB","MAC","15.6"),
                new Laptop(201,"SSD 250","M1","8 GB","MAC","13")
        );
    }
}