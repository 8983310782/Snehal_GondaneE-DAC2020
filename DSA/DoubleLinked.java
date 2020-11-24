class Node7
{
    public int data;
    public Node7 next;
    public Node7 prev;

    public void displayNodeData()
    {
        System.out.println( + data );
    }
}

public class DoubleLinked
{
    private Node7 head;
    private Node7 tail;
    int size;

    public boolean isEmpty()
    {
        return(head == null);
    }
// inserting a node at the start

    public void insertFirst(int data)
    {
        Node7 newNode = new Node7();
        newNode.data = data;
        newNode.next = head;
        newNode.prev = null;
        if(head != null)
            head.prev = newNode;
        head = newNode;
        if(tail == null)
            tail = newNode;
        size++;
    }
    // inserting node at the last

    public void insertLast(int data)
    {
        Node7 newNode = new Node7();
        newNode.data = data;
        newNode.next = null;
        newNode.prev = tail;
        if(tail != null)
            tail.next = newNode;
        tail = newNode;
        if(head == null)
            head = newNode;
        size++;
    }
// deleting node from start

    public Node7 deleteFirst()
    {
        if(size == 0)
            throw new RuntimeException("Doubly linked list is already empty");
        Node7 temp = head;
        head = head.next;
        head.prev = null;
        size--;
        return temp;
    }
//deleting node from last

    public Node7 deleteLast()
    {
        Node7 temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        return temp;
    }
// delete node after particular node

    public void deleteAfter(Node after)
    {
        Node7 temp = head;
        while(temp.next != null && temp.data != after.data)
        {
            temp = temp.next;
        }
        if(temp.next != null)
            temp.next.next.prev = temp;
        temp.next = temp.next.next;
    }
    public void printLinkedListForward()
    {
        System.out.println("Printing Doubly LinkedList (head -- tail)");
        Node7 current = head;
        while(current != null)
        {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }
    public void printLinkedListBackward()
    {
        System.out.println("Printing Doubly LinkedList(tail -- head)");
        Node7 current = tail;
        while(current != null)
        {
            current.displayNodeData();
            current = current.prev;
        }
        System.out.println();
    }
}