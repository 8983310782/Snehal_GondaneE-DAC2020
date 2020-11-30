public class MyStack {
    private int[] stack;
    private int top;
    private static int MAX = 100;

    public MyStack() {
        top = 0;
        stack = new int[MAX];
        System.out.println("Stack initialised");
    }

    public void push(int item){
        if (top >= MAX) System.out.println("Error: Stack overflow");
        else {
            stack[top++] = item;
        System.out.println("Push");
        }
    }

    public void pop()
    {
        if (top <= 0)
        {
            System.out.println("Error: Stack empty");
            //return -1;
        }
        else {
            --top;
            System.out.println("Pop");
        }
    }
    public boolean empty() {
        return top == 0;
    }
    public int top(){
        if (empty()) {System.out.println("Error: top on empty stack"); return -1;}
        return stack[top-1];
    }

    public static void main(String[] args){
        System.out.println("Inside Test");
        MyStack ms = new MyStack();
        ms.push(10);
        ms.push(7);
      //  System.out.println(" "+ms.pop()+" "+ms.pop());
    }
}public class SinglyLinkedListMain
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



-----------------------------------------------------------------------------------------------



class Node
{
    public int data;
    public Node next;
    public Node prev;

    public void displayNodeData()
    {
        System.out.println( + data );
    }
}

public class DoubleLinked
{
    private Node head;
    private Node tail;
    int size;

    public boolean isEmpty()
    {
        return(head == null);
    }
// inserting a node at the start

    public void insertFirst(int data)
    {
        Node newNode = new Node();
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
        Node newNode = new Node();
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

    public Node deleteFirst()
    {
        if(size == 0)
            throw new RuntimeException("Doubly linked list is already empty");
        Node temp = head;
        head = head.next;
        head.prev = null;
        size--;
        return temp;
    }
//deleting node from last

    public Node deleteLast()
    {
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        return temp;
    }
// delete node after particular node

    public void deleteAfter(Node after)
    {
        Node temp = head;
        while(temp.next != null && temp.data != after.data)
        {
            temp = temp.next;
        }
        if(temp.next != null)
            temp.next.next.prev = temp;
        temp.next = temp.next.next;
    }
//  printing for forward

    public void printLinkedListForward()
    {
        System.out.println("Printing Doubly LinkedList (head -- tail)");
        Node current = head;
        while(current != null)
        {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }
    // printing for backward

    public void printLinkedListBackward()
    {
        System.out.println("Printing Doubly LinkedList(tail -- head)");
        Node current = tail;
        while(current != null)
        {
            current.displayNodeData();
            current = current.prev;
        }
        System.out.println();
    }
}public class DoubleLinkedMain
{
    public static void main(String[] args)
    {
        DoubleLinked myLinkedlist = new DoubleLinked();
        myLinkedlist.insertFirst(50);
        myLinkedlist.insertFirst(60);
        myLinkedlist.insertFirst(70);
        myLinkedlist.insertFirst(10);
        myLinkedlist.insertLast(20);
        myLinkedlist.printLinkedListForward();
        myLinkedlist.printLinkedListBackward();

        System.out.println("==============================");


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


----------------------------------------------------------------------------------------------------------------------


class CircularQueue {
    int size;
    int rear;
    int front;
    int qArray[];

    CircularQueue(int size) {
        this.size = size;
        this.qArray = new int[size];
        this.rear = -1;
        this.front = -1;
    }

    void enQueue(int item) {
        if (((rear + 1) % size) == front) {
            System.out.println("Queue is full");
        } else {
            if (rear == front && front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            qArray[rear] = item;
        }
    }

    void deQueue() {
        if (rear == front && rear == -1) {
            System.out.println("Queue is empty.");
        } else {
            int item = qArray[front];
            qArray[front] = 0;//reset data
            if (rear == front) {//Queue is empty
                rear = -1;
                front = -1;
            } else {
                front = (front + 1) % size;
            }
            System.out.println(item + " is dequeued from the Queue");
        }
    }


    public String toString(){
        StringBuffer buf = new StringBuffer();
        for (int item: qArray){
            if (item !=0){
                buf.append(item);
                buf.append(",");
            }
        }
        return buf.toString();
    }
    // Display the queue
    void display() {
        int tmpfront = front;
        if (rear == front && rear == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println(toString());
        }
    }

    public static void main(String[] args) {
        int size = 3;
        CircularQueue queue = new CircularQueue(size);

        queue.enQueue(5);
        queue.display();
        queue.enQueue(10);
        queue.display();
        queue.enQueue(20);
        queue.display();
        queue.enQueue(40);
        queue.display();
        queue.deQueue();
        queue.display();
        queue.deQueue();
        queue.display();

    }
}


----------------------------------------------------------------------------------------------------------