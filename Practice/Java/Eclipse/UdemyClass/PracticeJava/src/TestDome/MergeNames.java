package TestDome;

import java.util.ArrayList;
import java.util.List;

public class MergeNames {
    public static String[] uniqueNames(String[] names1, String[] names2) {
        List<String> result = new ArrayList<>();
        for(String s : names1) if(!result.contains(s)) result.add(s);
        for(String s : names2) if(!result.contains(s)) result.add(s);

        return result.toArray(new String[0]);
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
