package U7T1;
import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car newCar) {
        inventory.add(newCar);
    }

    public boolean swap(int num1, int num2) {
        if (num1 < 0 || num1 >= inventory.size() || num2 < 0 || num2 >= inventory.size()) {
            return false;
        }
        inventory.set(num2, inventory.set(num1, inventory.get(num2)));
        return true;
    }
}
