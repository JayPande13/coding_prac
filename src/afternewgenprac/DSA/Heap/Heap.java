package afternewgenprac.DSA.Heap;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        PriorityQueue<Person> heap = new PriorityQueue<>(Comparator.reverseOrder()); //default min heap
        Person p1 = new Person("mc", 26, 4);
        Person p2 = new Person("ds", 26, 5);
        Person p3 = new Person("ww", 24, 6);
        heap.offer(p1);
        heap.offer(p2);
        heap.offer(p3);
        while (!heap.isEmpty()) {
            System.out.println("Top element : " + heap.peek().name);
            System.out.println("Element removed(top) : " + Objects.requireNonNull(heap.poll()).name);
        }

    }
}

class Person implements Comparable<Person> {
    String name;
    int age;
    int dickSize;

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age) return 1;
        else if (this.age < o.age) return -1;
        else {
            return Integer.compare(this.dickSize, o.dickSize);
        }
    }

    public Person(String name, int age, int dickSize) {
        this.name = name;
        this.age = age;
        this.dickSize = dickSize;
    }
}
