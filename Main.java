import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2015, "Black", 25000.0, "AB123CD"),
            new Car(2, "Honda", "Civic", 2019, "White", 22000.0, "EF456GH"),
            new Car(3, "Toyota", "Corolla", 2021, "Red", 20000.0, "IJ789KL"),
            new Car(4, "BMW", "X5", 2018, "Blue", 45000.0, "MN012OP")
        };

        Car[] toyotaCars = getCarByBrend(cars, "Toyota"); 
        System.out.println("Машины марки Toyota:");
        for (Car car : toyotaCars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getYear());
        }
        System.out.println("Машины Toyota старше 4 лет:");
        Car[] oldToyotaCars = getCarByBrendAndYearOperational(cars, "Toyota", 4);
        for (Car car : oldToyotaCars) {
            System.out.println("  - " + car.getBrand() + " " + car.getModel() + " " + car.getYear() + 
                          " (эксплуатируется " + (java.time.Year.now().getValue() - car.getYear()) + " лет)");
    }

    }

    public static Car[] getCarByBrend(Car[] cars, String brend) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                result.add(car);
            }
        }
        return result.toArray(new Car[0]);
    }
    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years) {
        List<Car> result = new ArrayList<>();
        int currentYear = java.time.Year.now().getValue();
        
        for (Car car : cars) {
            int yearsOperational = currentYear - car.getYear();
            if (car.getBrand().equalsIgnoreCase(brend) && yearsOperational > years) {
                result.add(car);
            }
        } 
        return result.toArray(new Car[0]); 
    }
}

