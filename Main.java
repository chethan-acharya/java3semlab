import java.util.Scanner;

class Stack {
    int[] s = new int[10];
    int top;

    Stack() {
        top = -1;
    }

    void push(int item) {
        if (top != 9) {
            s[++top] = item;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            System.out.println("Popped item is: " + s[top]);
            return s[top--];
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty, no item to display");
        } else {
            System.out.println("Items in stack are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(s[i]);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        int ch;
        Stack stk = new Stack();
        Scanner ob = new Scanner(System.in);

        while (true) {
            System.out.println("\nStack operation demo");
            System.out.println("1: Push, 2: Pop, 3: Display items, 4: Exit");
            System.out.println("Enter your choice:");
            ch = ob.nextInt();

            switch (ch) {
                case 1:
                    if (stk.top == 9) {
                        System.out.println("Stack is full");
                    } else {
                        System.out.println("Enter the item to be pushed");
                        int item = ob.nextInt();
                        stk.push(item);
                    }
                    break;

                case 2:
                    stk.pop();
                    break;

                case 3:
                    stk.display();
                    break;

                case 4:
                    ob.close();
                    return;

                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
}