class Stack1 
{
    private int arr[];

    private int top;

    private int capacity;

    Stack1(int size) 
	{
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");

            // terminates the program
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() 
	{
        if (isEmpty()) 
		{
            System.out.println("STACK EMPTY");
           
            System.exit(1);
        }

        return arr[top--];


    }

    public int getSize() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Stack1 stack = new Stack1(5);

        stack.push(19);
        stack.push(24);
        stack.push(31);

        System.out.print("Stack: ");
        stack.display();

        stack.pop();
        System.out.println("\nAfter popping out");
        stack.display();

    }
}


-----------------------------------------------------------------------------------




class Stack1 {
    private int arr[];

    private int top;

    private int capacity;

    Stack1(int size) {
        // initialize the array
        // initialize the stack variables
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");

            // terminates the program
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() {

        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }

        return arr[top--];


    }

    public int getSize() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Stack1 stack = new Stack1(5);

        stack.push(19);
        stack.push(24);
        stack.push(31);

        System.out.print("Stack: ");
        stack.display();

        // remove element from stack
        stack.pop();
        System.out.println("\nAfter popping out");
        stack.display();

    }
}
----------------------------------------------------------------------------------------------------



class Test
{
    // Pushing element on the top of the stack
    static void stack_push(Stack<Number> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Number> stack)
    {
        System.out.println("Pop Operation:");

        for(int i = 0; i < 5; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    // Displaying element on the top of the stack
    static void stack_peek(Stack<Number> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    // Searching element in the stack
    static void stack_search(Stack<Number> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }


    public static void main (String[] args)
    {
        

       // Stack<Number> stack = new Stack<Integer>();

       //6);
    }
}


--------------------------------------------------------------------------------------------


class Rstack
{
    int size;
    int top;
    char[] a;

    boolean isEmpty()
    {
        return (top < 0);
    }

    Rstack(int n)
    {
        top = -1;
        size = n;
        a = new char[size];
    }

    boolean push(char x)
    {
        if (top >= size)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }
    char pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            char x = a[top--];
            return x;
        }
    }


/*

class Main
{
    public static void reverse(StringBuffer str)
    {
        int n = str.length();
        Stack obj = new Stack(n);

        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

        for (i = 0; i < n; i++)
        {
            char ch = (char) obj.pop();
            str.setCharAt(i,ch);
        }
    }*/

    //driver function
    public static void main(String args[])
    {
        //create a new string
        StringBuffer s= new StringBuffer("Snehal ");

        //call reverse method
        s.reverse();

        //print the reversed string
        System.out.println("Reversed string is " + s);
    }
}
-------------------------------------------------------------------------------------------------------