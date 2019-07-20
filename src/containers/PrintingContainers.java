package containers;

import java.util.*;

class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("szczur");
        collection.add("kot");
        collection.add("pies");
        collection.add("pies");

        return collection;
    }
    static Map fill(Map<String,String> map) {
        map.put("szczur", "Gonek");
        map.put("kot", "Maja");
        map.put("pies", "Bosco");
        map.put("pies", "Spot");

        return map;
    }

    public static void test() {
        System.out.println("Printing Containers...");
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));

        // Set
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));

        // Map
        System.out.println(fill(new HashMap<String,String>()));
        System.out.println(fill(new TreeMap<String,String>()));
        System.out.println(fill(new HashMap<String,String>()));
    }
}



