class Node1
{
    public int data;
    public Node next;

    public void displayNodeData()
    {
        System.out.println(" { " + data + " } ");
    }
}

public class SinglyLinkedList
{
    private Node head;

    public boolean isEmpty()
    {
        return (head == null);
    }
    public void insertFirst(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    // deleting node from start
    public Node deleteFirst()
    {
        Node temp = head;
        head = head.next;
        return temp;
    }
    // deleting node at after specific node
    public void deleteAfter(Node after)
    {
        Node temp = head;
        while(temp.next != null && temp.data != after.data)
        {
            temp = temp.next;
        }
        if(temp.next != null)
            temp.next = temp.next.next;
    }
    // again inserting node at the start
    public void insertLast(int data)
    {
        Node current = head;
        while(current.next != null)
        {
            current = current.next;  // we'll loop until current.next is null
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
    //for printing
    public void printLinkedList()
    {
        System.out.println("Printing LinkedList (head -- last)");
        Node current = head;
        while(current != null)
        {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }

}
public class SinglyLinkedListMain
{
    public static void main(String[] args)
    {
        SinglyLinkedList myLinkedlist = new SinglyLinkedList();
        myLinkedlist.insertFirst(53);
        myLinkedlist.insertFirst(65);
        myLinkedlist.insertFirst(70);
        myLinkedlist.insertFirst(12);
        myLinkedlist.insertLast(212);
        // linked list will be

        Node node = new Node();
        node.data = 1;
        myLinkedlist.deleteAfter(node);
        //After deleting

        myLinkedlist.printLinkedList();
    }
}
