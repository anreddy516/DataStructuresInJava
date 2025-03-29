package com.anr.ds.queue;

public class MyQueue {
    private int front;
    private int rear;
    private final int capacity;
    private final int[] queueItems;

    // Creates queue with some capacity
    public MyQueue(int capacity) {
        this.front = -1;
        this.rear = -1;
        this.capacity = capacity;
        this.queueItems = new int[capacity];
    }

    // isQueueFull()

    boolean isQueueFull() {
        if (this.rear == this.capacity - 1) {
            return true;
        } else {
            return false;
        }
    }

    // isQueueEmpty()
    boolean isQueueEmpty() {
        if (this.front == -1 && this.rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    // enqueue()

    boolean enqueue(int item) {
        if (this.isQueueFull()) {
            System.out.println("Queue is full or overflow");
            return false;
        }

        if (this.front == -1 && this.rear == -1) {
            this.front = 0;
            this.rear = 0;
            queueItems[this.rear] = item;
            return true;
        } else {
            this.rear = this.rear + 1;
            queueItems[this.rear] = item;
            return true;
        }
    }

    // dequeue()

    int dequeue() {
        if (this.isQueueEmpty()) {
            System.out.println("Queue is empty or underflow");
            return -1;
        }

        int item = this.queueItems[front];
        this.front = this.front + 1;
        return item;
    }

    // peek()
    int peek() {
        if (this.isQueueEmpty()) {
            System.out.println("Queue is empty or underflow");
            return -1;
        }

        int item = this.queueItems[front];
        return item;
    }

    // displayItemsInQueue()
    void displayItemsInQueue() {
        System.out.println("Rear = " + rear);
        System.out.println("Front = " + front);
        System.out.println("Capacity = "+ capacity);
        System.out.print("Queue items are : ");
        if (!isQueueEmpty()) {
            for (int i = front; i <= rear; i++) {
                System.out.print(this.queueItems[i] + " ");
            }
            System.out.println();
        }
    }
}
