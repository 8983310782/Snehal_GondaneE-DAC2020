class LinearQueue
{
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor to initialize queue
    LinearQueue(int size)
    {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void dequeue()
    {
        if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Removing " + arr[front]);

        front = (front + 1) % capacity;
        count--;
    }
    public void enqueue(int item)
    {
        // check for queue overflow
        if (isFull())
        {
            System.out.println("OverFlow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        return arr[front];
    }
    public int size()
    {
        return count;
    }
    public Boolean isEmpty()
    {
        return (size() == 0);
    }



    public Boolean isFull()
    {
        return (size() == capacity);
    }

    public static void main (String[] args)
    {
        LinearQueue q = new LinearQueue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Front element is: " + q.peek());
        q.dequeue();
        System.out.println("Front  is: " + q.peek());

        System.out.println(" size is " + q.size());

        q.dequeue();
        q.dequeue();

        if (q.isEmpty())
            System.out.println(" Empty");
        else
            System.out.println(" Not Empty");
    }
}


--------------------------------------------------------------------------------------------------------




public class Circular
{
    int SIZE = 5; 
    int front, rear;
    int items[] = new int[SIZE];

    Circular() {
        front = -1;
        rear = -1;
    }
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % SIZE;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    // Removing an element
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */
            else {
                front = (front + 1) % SIZE;
            }
            return (element);
        }
    }

    void display() {
        /* Function to display status of Circular Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
           // System.out.println("Front -> " + front);
           // System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % SIZE)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            //System.out.println("Rear -> " + rear);
        }
    }

    public static void main(String[] args) {

        Circular q = new Circular();

        // Fails because front = -1
        q.deQueue();

        q.enQueue(14);
        q.enQueue(22);
        q.enQueue(36);
        q.enQueue(45);
        q.enQueue(51);

        // Fails to enqueue because front == 0 && rear == SIZE - 1
        q.enQueue(6);

        q.display();

        int elem = q.deQueue();

       /* if (elem != -1) {
            System.out.println("Deleted Element is " + elem);
        }*/
        q.display();

        q.enQueue(73);

        q.display();

        // Fails to enqueue because front == rear + 1
        q.enQueue(8);
    }
-----------------------------------------------------------------------------------------


import java.util.*;

/*  Class Node  */
class Node
{
    protected int data;
    protected Node link;

    /*  Constructor  */
    public Node()
    {
        link = null;
        data = 0;
    }
    /*  Constructor  */
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }
    /*  Function to set link to next Node  */
    public void setLink(Node n)
    {
        link = n;
    }
    /*  Function to set data to current Node  */
    public void setData(int d)
    {
        data = d;
    }
    /*  Function to get link to next node  */
    public Node getLink()
    {
        return link;
    }
    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }
}

/*  Class Dequeue  */
class Dequeue
{
    private Node front, rear;
    private int size;

    /* Constructor */
    public Dequeue()
    {
        front = null;
        rear = null;
        size = 0;
    }
    /*  Function to check if queue is empty */
    public boolean isEmpty()
    {
        return front == null;
    }
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return size;
    }
    /* Clear dequeue */
    public void clear()
    {
        front = null;
        rear = null;
        size = 0;
    }
    /*  Function to insert an element at begining  */
    public void insertAtFront(int val)
    {
        Node nptr = new Node(val, null);
        size++ ;
        if (front == null)
        {
            front = nptr;
            rear = front;
        }
        else
        {
            nptr.setLink(front);
            front = nptr;
        }
    }
    /*  Function to insert an element at end  */
    public void insertAtRear(int val)
    {
        Node nptr = new Node(val,null);
        size++ ;
        if (rear == null)
        {
            rear = nptr;
            front = rear;
        }
        else
        {
            rear.setLink(nptr);
            rear = nptr;
        }
    }
    /*  Function to remove front element from the queue */
    public int removeAtFront()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        Node ptr = front;
        front = ptr.getLink();

        if (front == null)
            rear = null;
        size-- ;

        return ptr.getData();
    }
    /*  Function to remove rear element from the queue */
    public int removeAtRear()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        int ele = rear.getData();
        Node s = front;
        Node t = front;
        while (s != rear)
        {
            t = s;
            s = s.getLink();
        }
        rear = t;
        rear.setLink(null);
        size --;

        return ele;
    }
    /*  Function to check the front element of the queue */
    public int peekAtFront()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return front.getData();
    }
    /*  Function to check the front element of the queue */
    public int peekAtRear()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return rear.getData();
    }
    /*  Function to display the status of the queue */
    public void display()
    {
        System.out.print("\nDequeue = ");
        if (size == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        Node ptr = front;
        while (ptr != rear.getLink() )
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.println();
    }
}

/*  Class DoubleEndedQueueTest  */
public class DoubleEndedeQueue
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /* Creating object of class Dequeue */
        Dequeue dq = new Dequeue();
        /* Perform Dequeue Operations */
        System.out.println("Dequeue Test\n");
        char ch;
        do
        {
            System.out.println("\nDequeue Operations");
            System.out.println("1. insert at front");
            System.out.println("2. insert at rear");
            System.out.println("3. delete at front");
            System.out.println("4. delete at rear");
            System.out.println("5. peek at front");
            System.out.println("6. peek at rear");
            System.out.println("7. size");
           // System.out.println("8. check empty");
            //System.out.println("9. clear");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    dq.insertAtFront( scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("Enter integer element to insert");
                    dq.insertAtRear( scan.nextInt() );
                    break;
                case 3 :
                    try
                    {
                        System.out.println("Removed Element = "+ dq.removeAtFront());
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 4 :
                    try
                    {
                        System.out.println("Removed Element = "+ dq.removeAtRear());
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 5 :
                    try
                    {
                        System.out.println("Peek Element = "+ dq.peekAtFront());
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 6 :
                    try
                    {
                        System.out.println("Peek Element = "+ dq.peekAtRear());
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 7 :
                    System.out.println("Size = "+ dq.getSize());
                    break;
               /* case 8 :
                    System.out.println("Empty status = "+ dq.isEmpty());
                    break;
                case 9 :
                    System.out.println("\nDequeue Cleared\n");
                    dq.clear();
                    break;*/
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /* display dequeue */
            dq.display();

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
