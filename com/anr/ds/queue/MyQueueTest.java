package com.anr.ds.queue;

import java.util.Scanner;

public class MyQueueTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Queue Capacity : ");
        int capacity = scanner.nextInt();
        MyQueue queue = new MyQueue(capacity);

        int choice, item;
        do {
            System.out.println("********************");
            System.out.println("1 - For Enqueue");
            System.out.println("2 - For Dequeue");
            System.out.println("3 - For Peek");
            System.out.println("4 - For Queue Full");
            System.out.println("5 - For Queue Empty");
            System.out.println("6 - For Display Queue items");
            System.out.println("7 - For Exit");

            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 : // Enqueue
                    System.out.print("Enter value to be inserted into queue : ");
                    item = scanner.nextInt();
                    queue.enqueue(item);
                    break;
                case 2 : // Dequeue
                    item = queue.dequeue();
                    System.out.println("Removed item from Queue is " + item);
                    break;
                case 3 : // Peek
                    item = queue.peek();
                    System.out.println("Peek item is " + item);
                    break;
                case 4 : // Queue Full
                    boolean queueFull = queue.isQueueFull();
                    if (queueFull) {
                        System.out.println("Queue is full");
                    } else {
                        System.out.println("Queue is not full");
                    }
                    break;
                case 5 : // Queue Empty
                    boolean queueEmpty = queue.isQueueEmpty();
                    if (queueEmpty) {
                        System.out.println("Queue is Empty");
                    } else {
                        System.out.println("Queue is not Empty");
                    }
                    break;
                case 6 : // Display Items
                    queue.displayItemsInQueue();
                    break;
                case 7 :
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 7);
    }
}
