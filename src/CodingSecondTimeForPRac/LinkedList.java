package CodingSecondTimeForPRac;

import java.util.Objects;

public class LinkedList<E> {
    Node<E> head;
    static class Node<E> {
        E value;
        Node<E> nextAddress;

        Node(E value){
           this.value = value;
           this.nextAddress = null;
        }
    }

    public LinkedList<E> add(int input,LinkedList<E> list ){
        Node<E> node = new Node(input);
        if(list.head == null){
            list.head = node;
        }else{
            Node<E> temp = list.head;
            while(temp.nextAddress != null){
                temp = temp.nextAddress;
            }
            temp.nextAddress = node;
        }
        return  list;

    }

    public LinkedList<E> delete(int input,LinkedList<E> list){
        if(list.head== null){
            System.out.println("List is empty");
        }else if(Objects.equals(list.head.value,input)){
            list.head  = list.head.nextAddress;
        }
        else{
            Node<E> deleteValueNode = list.head;
            Node<E> justPreviousNode = list.head;
            while(!Objects.equals(deleteValueNode.value,input) ){
                justPreviousNode= deleteValueNode;
                deleteValueNode = deleteValueNode.nextAddress;
            }
            justPreviousNode.nextAddress = deleteValueNode.nextAddress;
            deleteValueNode.nextAddress =null;
            deleteValueNode.value = null;
        }

        return list;
    }

    public void print(LinkedList<E> list){
        if(list.head == null){
            System.out.println("List is Empty");
        }
        Node<E> header =  list.head;
        while(header != null){
            System.out.print(header.value + " ");
            header = header.nextAddress;
        }
        System.out.println(
                
        );
    }

    public LinkedList<E> edit(E oldValue, E newValue, LinkedList<E> list){
        if(list.head == null){
            System.out.println("List is Empty");
        }else if(Objects.equals(list.head.value,oldValue)){
            list.head.value = newValue;
        }else{
            Node<E> updatingValueNode = list.head;
            Node<E> justPreviousNode = list.head;
            while(!Objects.equals( updatingValueNode.value,oldValue) ){
                justPreviousNode = updatingValueNode;
                updatingValueNode = updatingValueNode.nextAddress;
            }
            updatingValueNode.value = newValue;
            justPreviousNode.nextAddress = updatingValueNode;
        }
        return list;
    }


}
