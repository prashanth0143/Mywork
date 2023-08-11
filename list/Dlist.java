package list;

public class Dlist {

    private Node head;





    private class Node{

        private int val;
        private Node next;
        private Node prev;


        Node(int val){
            this.val = val;
        }

        Node(int val, Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){

        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }

        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;
    }

    public void display(){
        Node temp = head;
        Node last = null;

        while (temp != null){
            System.out.print(temp.val+ " --> ");
            last = temp;
            temp =temp.next;
        }

        System.out.println(" ");

        while (last != null){

            System.out.print(last.val + " <--- ");
            last = last.prev;
        }


    }

    public void insertAtLast(int val){
        Node node = new Node(val);
        if(head == null){
            insertFirst(val);
            return;
        }
        Node temp = head;
        Node last = null;

        while (temp != null){
            last = temp;
            temp =temp.next;
        }

        last.next = node;
        node.prev = last;
        node.next = null;

    }

    public void insertNumberAfter(int val, int add){
        Node node = new Node(add);
        Node pre= getNode(val);
        if(pre.next != null){
            node.prev = pre;
            node.next = pre.next;
            pre.next = node;
            node.next.prev = node;
        }
        else {
            insertAtLast(add);
        }


    }

    public Node getNode(int val){

        Node temp = head;

        while (temp != null){
            if(temp.val == val){
                return temp;
            }
            temp =  temp.next;
        }
        return null;
    }

    public int deleteAtFirst(){
        int value = head.val;
        if(head.next != null){
            head = head.next;
            head.prev = null;
        }else {
            head = null;
        }



        return value;
    }

    public int delete(){
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }
        int value =  temp.val;
        temp.prev.next = null;
        temp.prev = null;

        return value;
    }



}
