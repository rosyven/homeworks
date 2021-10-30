
package cardriverclasses;


public class Car {

    public Car(String brand, String model, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Driver getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return "Car: " + "brand = " + brand + ", model = " + model + ", driver = " + driver;
    }
    String brand;
    String model;
    Driver driver;
    
    
}
