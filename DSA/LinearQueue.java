import java.util.*;

class LinearQueue
{
    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;

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

    // Utility function to check if the queue is full or not
    public Boolean isFull()
    {
        return (size() == capacity);
    }

    public static void main (String[] args)
    {
        // create a queue of capacity 5
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