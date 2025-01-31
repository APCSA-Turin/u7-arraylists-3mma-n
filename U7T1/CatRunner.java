package U7T1;
import java.util.ArrayList;
public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Joey");
        Cat cat2 = new Cat("Max");
        Cat cat3 = new Cat("Jenny");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("Toby");
        Cat replacedCat = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replacedCat);
        for (int i = 0; i < cats.size(); i++) {
            cats.get(i).setName(cats.get(i).getName().toUpperCase());
        }

        System.out.println(cats);
        System.out.println(cats.get(0) == cat1);
        System.out.println(cats.get(1) == cat2);
        System.out.println(cats.get(2) == cat4);
        
        cats.add(new Cat("SAM"));
        System.out.println(cats);
        
    }
}
