package containers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class LinkedListFeatures {

    public static void test() {
        System.out.println("LinkedListFeatures...");
        LinkedList<Pet> pets = new LinkedList<Pet>();
        Hamster h1 = new Hamster(4);
        Hamster h2 = new Hamster(3);
        Hamster h3 = new Hamster(2);
        Hamster h4 = new Hamster(3);
        pets.add(h1);
        pets.add(h2);
        pets.add(h3);
        pets.add(h4);
        // identyczne
        System.out.println(pets.getFirst());
        System.out.println(pets.element());
        // podobnie, różnica gdy brakuje elementów
        System.out.println(pets.peek()); // null jeżeli nie istnieje
        // identyczne i zwracają pierwszy element listy
        System.out.println(pets.remove());
        System.out.println(pets.removeFirst());
        // podobnie, różnica gdy brakuje elementów
        System.out.println(pets.poll());
        System.out.println(pets);
        // uwaga! nie ma tych metod w List
        System.out.println("addFirst");
        pets.addFirst(new Mouse(2));
        System.out.println(pets);
        pets.offer(new Mouse(4));
        pets.add(new Mouse(2));
        pets.addLast(new Mouse(3));
        System.out.println(pets);
        System.out.println(pets.removeLast());
        System.out.println(pets);

        // Stack (LIFO - last in first out)
        Stack<String> stack = new Stack<String>();
        for(String s: "Mój pies ma pchły".split(" "))
            stack.push(s);
        for(String s: stack) {
            System.out.print(s + " ");
        }
        System.out.println();
        while(!stack.empty())
            System.out.print(stack.pop() + " ");

        // Queue - Kolejka FIFO
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for(int i = 0; i < 10; i++) {
            queue.offer(rand.nextInt(i + 10));
        }
        QueueDemo.printQ(queue);
        Queue<Character> qc = new LinkedList<Character>();
        for(char c: "Brontozaur".toCharArray())
            qc.offer(c); // automatyczne pakowanie!
        QueueDemo.printQ(qc);

        // PriorityQueue - Kolejka priorytetowa
        PriorityQueueDemo.test();

    }
}
