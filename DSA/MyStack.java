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
}