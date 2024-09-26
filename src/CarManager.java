import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarManager {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Camry", 2018, "Blue", 24000, "XYZ123"));
        cars.add(new Car(2, "Honda", "Civic", 2016, "Red", 22000, "ABC456"));
        cars.add(new Car(3, "Toyota", "Corolla", 2020, "White", 20000, "DEF789"));
        cars.add(new Car(4, "Ford", "Fiesta", 2015, "Black", 15000, "GHI012"));
        cars.add(new Car(5, "Honda", "Accord", 2017, "Gray", 26000, "JKL345"));

        saveCarsByBrand(cars, "Toyota");
        saveCarsByModelOlderThan(cars, "Civic", 5);
        saveCarsByYearAndPrice(cars, 2016, 20000);
    }

    public static void saveCarsByBrand(List<Car> cars, String brand) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMake().equalsIgnoreCase(brand)) {
                filteredCars.add(car);
            }
        }
        writeCarsToFile(filteredCars, brand + "_cars.txt");
    }

    public static void saveCarsByModelOlderThan(List<Car> cars, String model, int years) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && car.getAge() > years) {
                filteredCars.add(car);
            }
        }
        writeCarsToFile(filteredCars, model + "_older_than_" + years + "_years.txt");
    }

    public static void saveCarsByYearAndPrice(List<Car> cars, int year, double price) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price) {
                filteredCars.add(car);
            }
        }
        writeCarsToFile(filteredCars, "cars_from_" + year + "_above_" + price + ".txt");
    }

    public static void writeCarsToFile(List<Car> cars, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Car car : cars) {
                writer.write(car.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
