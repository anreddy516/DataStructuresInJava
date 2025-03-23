package com.anr.ds.stack;

import java.util.Scanner;

public class StackDataStructureTest {
    public static void main(String[] args) {
        StackDataStructure stack = new StackDataStructure(4);
        int item;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int choice = scanner.nextInt();

        while(true) {
            if (choice == 6) {
                System.out.println("Exited");
                break;
            }

            switch (choice) {
                case 1:
                    // push
                    System.out.println("Enter item to be pushed");
                    item = scanner.nextInt();
                    stack.push(item);
                    stack.print();
                    break;

                case 2:
                    // Pop
                    item = stack.pop();
                    System.out.println("Got item from stack = " + item);
                    stack.print();
                    break;

                case 3:
                    // peek
                    item = stack.peek();
                    System.out.println("Got item from stack = " + item);
                    stack.print();
                    break;

                case 4:
                    // Overflow
                    boolean overflow = stack.isStackFull();
                    if (overflow) {
                        System.out.println("Stack is overflow");
                    } else {
                        System.out.println("Stack is not overflow");
                    }
                    stack.print();
                    break;

                case 5:
                    // Overflow
                    boolean underflow = stack.isStackEmpty();
                    if (underflow) {
                        System.out.println("Stack is underflow");
                    } else {
                        System.out.println("Stack is not underflow");
                    }
                    stack.print();
                    break;
            }
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
        }
    }
}
