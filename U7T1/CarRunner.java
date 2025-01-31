package U7T1;

public class CarRunner {
    public static void main(String[] args) {
        UsedCarLot lot = new UsedCarLot();
        lot.addCar(new Car("Mustang", 12500));
        lot.addCar(new Car("Camry", 8400));
        lot.addCar(new Car("Ram", 17200));
        lot.addCar(new Car("Accent", 1980));
        lot.addCar(new Car("Cruiser", 10500));
        System.out.println("--original inventory--");
        System.out.println(lot.getInventory());
        boolean swapped = lot.swap(2, 4);
        System.out.println("--Ram and Cruiser swap successful--");
        System.out.println(swapped);
        System.out.println(lot.getInventory());
        System.out.println("--Mustang and Cruiser swap successful--");
        swapped = lot.swap(0, 2);
        System.out.println(swapped);
        System.out.println(lot.getInventory());
        System.out.println("--swap unsuccessful; 5 out of bounds --");
        swapped = lot.swap(1, 5);
        System.out.println(swapped);
        System.out.println(lot.getInventory());
    }
}
