package containers;

import java.util.*;

class Pet implements Comparable {
    int wiek = 0;
    Pet() {}
    Pet(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return super.toString() + " = " + this.wiek;
    }

    @Override
    public int compareTo(Object o) {
        Pet p = (Pet)o;
        if(p.wiek > this.wiek) {
            return -1;
        }
        if(p.wiek < this.wiek) {
            return 1;
        }
        return 0;
    }
}
class Hamster extends Pet{
    Hamster(int wiek) {super(wiek);}

    @Override
    public boolean equals(Object o) {
        return this.wiek == ((Hamster)o).wiek;
    }

    @Override
    public int hashCode() {
        return wiek;
    }
}
class Cymric extends Pet{
    Cymric(int wiek) {super(wiek);}
}
class Mouse extends Pet{
    Mouse(int wiek) {super(wiek);}
}

public class ListFeatures {

    public static void test() {
        System.out.println("List Features...");
        Random rand = new Random(47);
        List<Pet> pets = new ArrayList<Pet>();
        Hamster h1 = new Hamster(4);
        Hamster h2 = new Hamster(3);
        Hamster h3 = new Hamster(2);
        Hamster h4 = new Hamster(3);
        Hamster h5 = new Hamster(2);
        Hamster h6 = new Hamster(1);
        Hamster h7 = new Hamster(2);
        Hamster h = new Hamster(3);
        pets.add(h1);
        pets.add(h2);
        pets.add(h3);
        pets.add(h4);
        pets.add(h5);
        pets.add(h6);
        pets.add(h7);
        pets.add(h);
        System.out.println(pets);
        System.out.println(pets.contains(h));
        pets.remove(h);
        System.out.println(pets);
        Pet p = pets.get(2);
        System.out.println(p + " " + pets.indexOf(p));
        Pet cymric = new Cymric(3);
        System.out.println(pets.indexOf(cymric));
        System.out.println(pets.remove(cymric));
        System.out.println(pets.remove(p));
        System.out.println(pets);
        pets.add(3, new Mouse(1));
        System.out.println(pets);
        List<Pet> sub = pets.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println(pets.containsAll(sub));
        Collections.sort(sub);
        System.out.println(sub);
        Collections.shuffle(sub, rand);
        System.out.println("shuffle: " + sub);
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println(sub);
        sub.set(0, h5);
        copy.retainAll(sub);
        System.out.println(copy);
        copy = new ArrayList<Pet>(pets);
        copy.remove(2);
        System.out.println(copy);
        copy.removeAll(sub);
        System.out.println("copy: " + copy);
        copy.set(1, new Mouse(5));
        copy.addAll(2, sub);
        System.out.println(copy);
        System.out.println(pets.isEmpty());
        pets.clear();
        System.out.println(pets.isEmpty());
        pets.add(h1);
        pets.add(h2);
        pets.add(h3);
        pets.add(h4);
        pets.add(h5);
        pets.add(h6);
        Object[] o = pets.toArray();
        System.out.println(o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        System.out.println(pa[3].wiek);
    }
}
