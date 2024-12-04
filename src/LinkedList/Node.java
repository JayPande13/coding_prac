package LinkedList;

import java.util.Objects;

public class Node {
    Integer variable;
    Node next;

    Node(Integer data){
        variable=data;
        next =null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(variable, node.variable) && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variable, next);
    }
}
