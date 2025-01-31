package U7T1;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ben");
        names.add("Andy");
        names.add("David");
        String[] moreNames = {"Crystal", "Monica", "Toby", "Nancy"};
        int namesAmt = names.size();
        int moreNamesAmt = moreNames.length;
        int thirdNameLength = names.get(2).length();
        int secondNameLength = moreNames[1].length();
        int lengths = namesAmt + moreNamesAmt + thirdNameLength + secondNameLength;
        System.out.println(lengths); // should print 18
    }
}