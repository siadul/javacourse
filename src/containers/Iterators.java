package containers;

import java.util.*;

class Iterators {
    public static void test() {
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        Iterator i = list.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        for(String s: list) {
            System.out.println(s);
        }
        i = list.iterator();
//        list.add("ccc"); błąd
        for(int k = 0; k < list.size()-1; k++) {
            System.out.println(list.get(k));
            i.next();
            i.remove();
        }
        System.out.println(list);

        // Zadanie
        // a) Dodać metodę "display", która będzie wypisywać
        // elementy dowolnego kontenera implementującego
        // interfejs Collection, przy użyciu iteratora.
        // b) Stworzyć 3 rodzaje takich kolekcji
        // (ArrayList, LinkedList, HashSet),
        // wypełnić przykładowymi elementami i przekazać
        // do metody "display"
        List<String> l1 = new ArrayList<String>();
        LinkedList<String> l2 = new LinkedList<String>();
        HashSet<String> l3 = new HashSet<String>();
        l1.add("l1a");
        l1.add("l1b");
        l1.add("l1c");

        l2.add("l2c");
        l2.add("l2b");
        l2.add("l2a");
        Collections.sort(l2);

        l3.add("l3a");
        l3.add("l3b");
        l3.add("l3c");
        display(l1);
        display(l2);
        display(l3);
        System.out.println("iterators...");
        display(l1.iterator());
        display(l2.iterator());
        display(l3.iterator());

        // ListIterator
        System.out.println("ListIterator");
        ListIterator l2li = l2.listIterator();
        while(l2li.hasNext()) {
            System.out.println(l2li.next());
        }
        while(l2li.hasPrevious()) {
            System.out.println(l2li.previous());
        }

        // LinkedList
        // Podobna do ArrayList, operacje wstawiania do
        // środka listy i usuwania ich stamtąd są realizowane
        // szybciej, wolniej odbywa się przeglądanie.
        // Dzięki dodatkowym metodom możemy korzytać
        // z niej jak ze stosu lub kolejki/kolejki priorytetowej


    }

    public static void display(Collection<String> c) {
        // I sposób
        for (String s: c) { // niejawne wywołanie iterator()
            System.out.println(s);
        }
        // II sposób
        Iterator it = c.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
    public static void display(Iterator it) {
        // III sposób
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    
}



