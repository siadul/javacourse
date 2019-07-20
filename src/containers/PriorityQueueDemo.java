package containers;

import java.util.*;

public class PriorityQueueDemo {
    public static void test() {
        System.out.println("PriorityQueueDemo...");
        PriorityQueue<Integer> priorityQueue =
                new PriorityQueue<Integer>(); // tym razem nie LinkedList!
        Random rand = new Random(47);
        for(int i =0; i < 10; i++) {
            priorityQueue.offer(rand.nextInt(i + 10));
        }
        QueueDemo.printQ(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9,
        3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
//        ints.add(4); // error!
        List l = new ArrayList<Integer>(ints); // rozwiązanie
//        l.add(4);
        priorityQueue = new PriorityQueue<Integer>(ints);
        QueueDemo.printQ(priorityQueue);

        String fact = "BEZ PRACY NIE MA KOŁACZY";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
        QueueDemo.printQ(stringPQ);
        stringPQ = new PriorityQueue<String>(strings.size(),
                Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ);

        Set<Character> charSet = new HashSet<Character>();
        for(char c: fact.toCharArray())
            charSet.add(c);
        PriorityQueue<Character> characterPQ =
                new PriorityQueue<Character>(charSet);
        QueueDemo.printQ(characterPQ);

        // Set - zbiór, zapewnia unikalność obiektów, które
        // przechowuje.
        // Najpopularniejsze implementacje: HashSet i TreeSet
        Set<Integer> intset = new HashSet<Integer>();
        for(int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
        // Uwaga! w przypadku HashSet elementy nie muszą być posortowane

        SortedSet<Integer> intset2 = new TreeSet<Integer>();
        for(int i = 0; i < 10000; i++) {
            intset2.add(rand.nextInt(30));
        }
        System.out.println(intset2);
        // TreeSet gwarantuje nam przechowywanie elementów posortowanych

        System.out.println(intset2.contains(29)); // sprawdzenie czy zbiór zawiera taki element
        System.out.println(intset2.contains(39));

        // Przykład
        Hamster h1 = new Hamster(5); // identyczne chomiki
        Hamster h2 = new Hamster(5); // identyczne chomiki
        Mouse m1 = new Mouse(5);
        Set<Pet> zoo = new HashSet<Pet>();
        zoo.add(h1);
        zoo.add(h2); // uwaga na dodawanie obiektów!
        // nie jest istotna wartość pól w tym obiekcie
        // liczą się referencje
        zoo.add(m1);
        System.out.println(zoo); // 2 elementy? nie, TRZY!
        System.out.println(h1.equals(h2)); // true? nie, FALSE!
        System.out.println(h1 == h2); // true? nie, FALSE!
//        h2 = h1;
        System.out.println(h1.equals(h2)); // equals nie pomaga
        System.out.println(h1.hashCode()); // hashCode działa

        System.out.println("TreeSet...");
        Set<Pet> zooTree = new TreeSet<Pet>();
        zooTree.add(h1);
        zooTree.add(h2); // uwaga na dodawanie obiektów!
        zooTree.add(m1);
        System.out.println(zooTree); // 2 elementy? nie, JEDEN!
        // uwaga! w przypadku TreeSet przy dodwaniu elementu
        // do zbioru brana jest pod uwagę "wartość" obiektu

        // Map - odwzorowywanie obiektów na inne obiekty
        // przykład: słownik
        Map<Integer, String> m = new HashMap<Integer, String>();
        for (int i=0; i < 10000; i++) {
            m.put(rand.nextInt(20), "test" + i);
        }
        System.out.println(m);

        // Zadanie 1
        // Stworzyć klasę, zawierającą metodę, która będzie
        // tworzyła histogram wystąpień liter w Stringu
        // podanym jako argument i go wypisać

        // Zadanie 2
        // Stworzyć klasę, zawierającą metodę, która będzie
        // tworzyła histogram wystąpień SŁÓW zawierających
        // poszczególne litery alfabetu w Stringu
        // podanym jako argument.
        // Wypisać literę, liczbę wystąpień oraz
        // słowa zawierającę tę literę
        // Przykład:
        // INPUT: "A BB CD AD AFD"
        // OUTPUT: "A: 3 (A, AD, AFD)
        //          B: 1 (BB)
        //          C: 1 (CD)
        //          D: 2 (CD, AFD)
        //          F: 1 (AFD)




    }

}
