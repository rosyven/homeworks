
package cardriverclasses;


public class CarDriverClasses {

    
    public static void main(String[] args) {
        Driver driver1 = new Driver("Ivan", "Petrov", 21);
        System.out.println(driver1);
        Car car1 = new Car("Toyota", "Camry", driver1);
        System.out.println(car1);
    }
    
}
