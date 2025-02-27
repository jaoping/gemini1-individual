public class Vehicle {
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public Vehicle(String serialNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                ", baseCost=" + baseCost +
                '}';
    }

    public void createNewVehicleRecord() {
        System.out.println("Creating a new vehicle record for " + name + " (" + model + ")");
    }
}
