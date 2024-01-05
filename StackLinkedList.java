package study10;

public class Stack_LinkedList {

    private class Node {
        int data;
        Node nlink;
    }

    Node top;

    Stack_LinkedList() {
        this.top = null;
    }

    public void push(int val) {
        Node temp = new Node();

        if (temp == null) {
            System.out.print("\nStack Overflow");
            return;
        }

        temp.data = val;
        temp.nlink = top;
        top = temp;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty!");
            return -1; // Semicolon eklenmiş
        }
    }

    public void pop() {
        if (top == null) {
            System.out.print("\nStack Underflow!");
            return;
        }

        top = top.nlink;
    }

    public void display() {
        if (top == null) {
            System.out.print("\nStack Underflow!");
            System.exit(1); // exit() düzeltilmiş
        } else {
            Node temp = top;
            System.out.println("Stack elements:");
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.nlink;
            }
        }
    }

    public static class Main {
        public static void main(String[] args) {
            // Create a stack class object
            Stack_LinkedList stack_obj = new Stack_LinkedList();
            // push values into the stack
            stack_obj.push(9);
            stack_obj.push(7);
            stack_obj.push(5);
            stack_obj.push(3);
            stack_obj.push(1);

            // print Stack elements
            stack_obj.display();

            // print current stack top
            System.out.println("\nStack top : " + stack_obj.peek());

            // Pop elements twice
            System.out.println("Pop two elements");
            stack_obj.pop();
            stack_obj.pop();

            // print Stack elements
            stack_obj.display();

            // print new stack top
            System.out.println("\nNew Stack top:" + stack_obj.peek());
        }
    }
}
