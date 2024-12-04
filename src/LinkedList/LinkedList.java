package LinkedList;

import java.util.Objects;

public class LinkedList {

    Node head;

    public  LinkedList add(LinkedList list,Integer newInteger){

        Node newAddingNode = new Node(newInteger); // variable = 30 / next =null

        if(list.head == null){
            list.head = newAddingNode; // variable 10 / next =null
        }else{
            Node end =  list.head; // variable = 10/ next = varabile =20/next =nul; // varabile =20/next =nul
            while(end.next != null){ // h
                end = end.next;
            }
            end.next = newAddingNode; //head.next = varabile =30/next =null

        }
        return list;
    }

    public void print(LinkedList list){

        if(list.head== null){
            System.out.println("List is Empty");
        }else{
            Node nextElement =  list.head;
            while(nextElement != null){
                System.out.println(nextElement.variable);
                 nextElement = nextElement.next;
            }
        }
    }

    public LinkedList delete(LinkedList list,Integer remover){
        if(list.head== null){
            System.out.println("List is Empty");
        }else if(list.head.variable == remover){
            list.head  = list.head.next;
        }
        else{
            Node findingNode = list.head;
            Node justPrevious = list.head;
            while(!Objects.equals(findingNode.variable, remover)){
                justPrevious = findingNode;
                findingNode = findingNode.next;
            }

            if(findingNode.next != null){
                justPrevious.next = findingNode.next;
                findingNode.next = null;
            }
            findingNode.variable =null;
//            Node  leftNodes= justPrevious.next;
//            while(leftNodes.variable != null){
//                list = add(list,leftNodes.variable);
//                if(leftNodes.next != null) leftNodes = leftNodes.next;
//                else leftNodes = null;
//            }
        }
        return list;
    }

    public LinkedList editVariable(LinkedList list, Integer oldInteger,Integer newInteger) {
        if(list.head== null){
            System.out.println("List is Empty");
        }else{
            Node nextNode = list.head;
            Node justPrevious = list.head;
            while(!Objects.equals(nextNode.variable, oldInteger)){
                justPrevious = nextNode;
                nextNode = nextNode.next;
            }
            nextNode.variable = newInteger;
            justPrevious.next = nextNode;
        }
        return list;
    }
}
