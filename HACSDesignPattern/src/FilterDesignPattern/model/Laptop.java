package FilterDesignPattern.model;

public class Laptop {
    private int id;
    private String hardDisk;
    private String processor;
    private String ram;
    private String operatingSystem;
    private String screenSize;

    public Laptop(int id, String hardDisk, String processor, String ram,
                  String operatingSystem, String screenSize) {
        this.id = id;
        this.hardDisk = hardDisk;
        this.processor = processor;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
    }

    public int getId() {
        return id;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getScreenSize() {
        return screenSize;
    }

    @Override
    public java.lang.String toString() {
        return "Laptop{" +
                "id=" + id +
                ", hardDisk='" + hardDisk + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", screenSize='" + screenSize + '\'' +
                '}';
    }
}