package controllers;

import models.Node;

public class Queue<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    public Queue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(T data){
        Node<T> newNode = new Node<T>(data);

        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }

        size++;
    }

    public T dequeue(){
        if (isEmpty()) {
            return null;
        }

        T data = first.getValue();
        first = first.getNext();

        if (first == null) {
            last = null;
        }

        size--;
        return data;
    }

    public int size(){
        return size;
    }

    public void printAllNodes(){
        Node<T> current = first;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
