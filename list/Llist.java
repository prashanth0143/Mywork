package list;

import java.security.PrivateKey;
import java.util.List;
import java.util.PrimitiveIterator;

public class Llist {


    private Node head;
    private Node tail;

    private int size;


    Llist(){
      this .size = 0;
    }


    private class Node{
        private int val;
        private Node next;


        Node(int val){
            this.val = val;
        }

    }


    public void insertAtBegin(int val){

        Node node =  new Node(val);

        if(head == null){
            head= node;
            tail =head;
            size++;
            return;
        }

        node.next = head;
        head = node;
        size++;

    }

    public void display(){

        Node temp = head;

        while (temp != null){
            System.out.print(temp.val + " --> ");

            temp= temp.next;
        }

        System.out.println("end");
    }

    public void insertAtLast(int val){
        if(tail == null){
            insertAtBegin(val);
            return;
        }

        Node node =  new Node(val);
        tail.next = node;
        tail = node;
        size++;


    }

    public void insertAnyIndex(int val, int index){
        if(index == 0){
            insertAtBegin(val);
            return;
        }

        if(index == size){
            insertAtLast(val);
            return;
        }

        Node temp =  head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }

        Node node =  new Node( val);
        node.next = temp.next;
        temp.next  =  node;
        size++;
    }

    public void getSize(){
        System.out.println(size);
    }

    public Node getNode(int index){
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp= temp.next;

        }

        return temp;
    }

    public int deleteAtLast(){

        Node temp = getNode(size - 2);

        int val = tail.val;
        tail = temp;
        tail.next = null;
        size--;



        return val;
    }

    public int deleteAtFirst(){

        if(head == null){
            tail = null;
            return 0;
        }
        int val =  head.val;
        head =  head.next;

        size --;
        return val;

    }

    public int deleteAtindex(int index){
        if(index == 0){
            deleteAtFirst();
        }

        if(index == size-1){
            deleteAtLast();
        }

        Node node = getNode(index -1);

        int val= node.next.val;
        node.next = node.next.next;


        return val;
    }

    public Node getValNode(int val){
        Node temp = head;

        while (temp != null){
            if(temp.val == val){
                return temp;
            }

            temp = temp.next;
        }

        return null;
    }
}
