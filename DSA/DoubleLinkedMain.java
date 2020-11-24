public class DoubleLinkedMain
{
    public static void main(String[] args)
    {
        DoubleLinked myLinkedlist = new DoubleLinked();
        myLinkedlist.insertFirst(50);
        myLinkedlist.insertFirst(60);
        myLinkedlist.insertFirst(70);
        myLinkedlist.insertLast(20);
        myLinkedlist.printLinkedListForward();
        myLinkedlist.printLinkedListBackward();



        Node node = new Node();
        node.data = 1;
        myLinkedlist.deleteAfter(node);
        myLinkedlist.printLinkedListForward();
        myLinkedlist.printLinkedListBackward();

        System.out.println("================================");
        myLinkedlist.deleteFirst();
        myLinkedlist.deleteLast();

        myLinkedlist.printLinkedListForward();
        myLinkedlist.printLinkedListBackward();
    }
}