package com.anr.ds.stack;

public class StackDataStructure {

    int[] stackStorage;

    int top;
    int capacity;

    // Creating a stack with some capacity
    StackDataStructure (int capacity) {
        stackStorage = new int[capacity]; // setting up a storage
        top = -1; // initializing top index
        this.capacity = capacity;
    }

    // isStackFull() or stack overflow - when stack is full

    boolean isStackFull() {
        if (top == capacity - 1) {
            return true;
        } else {
            return false;
        }
    }

    // isStackEmpty() or stack underflow - when stack is empty.

    boolean isStackEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // push()
    boolean push(int item) {
        if (isStackFull()) {
            System.out.println("Stack is overflow");
            return false;
        }

        top = top + 1;
        stackStorage[top] = item;
        return true;
    }

    // pop()

    int pop() {
        if (isStackEmpty()) {
            System.out.println("Stack is underflow");
            return -1;
        }

        int item = stackStorage[top];
        top = top - 1;
        return item;
    }

    // peek()

    int peek() {
        if (isStackEmpty()) {
            System.out.println("Stack is underflow");
            return -1;
        }

        int item = stackStorage[top];
        return item;
    }

    void print() {
        System.out.println("Capacity = " + capacity);
        System.out.println("Top      = " + top);
        System.out.println("Stack items are here:");
        for (int i = top; i > -1; i--) {
            System.out.println(stackStorage[i]);
        }
    }
}
