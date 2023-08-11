package list;

public class Test {
    public static void main(String[] args) {

    Dlist list = new Dlist();

    list.insertFirst(12);
//        System.out.println(list.deleteAtFirst());
    list.insertFirst(55);
    list.insertFirst(10);
    list.insertFirst(13);

    list.insertAtLast(100);

    list.insertAtLast(99);

    list.insertNumberAfter(55,120);
    list.insertNumberAfter(120,200);
    list.insertNumberAfter(99,1500);

//   / list.deleteAtLast();

    list.display();

    System.out.println(list.delete());
    System.out.println(list.delete());

    list.display();

   // list.display();
    }
}
