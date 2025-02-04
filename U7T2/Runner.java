package U7T2;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = {new Car("Ram", 17200), new Car("Accent", 1980), new Car("Cruiser", 10500)};
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(cars));
        System.out.println(carList);
    }
}
