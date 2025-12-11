package controllers;

import models.Node;

public class ListaEnlazada<T> {
    private Node<T> head;
    private int size = 0;

    public void append(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
        size++;
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.getNext();
            size--;
        }
    }

    public void deleteLast() {
        if (head == null) return;          // lista vacía
        if (head.getNext() == null) {      // solo un elemento
            head = null;
            size--;
            return;
        }

        Node<T> current = head;
        while (current.getNext().getNext() != null) { 
            current = current.getNext();
        }

        current.setNext(null);
        size--;
    }

    public void deleteNode(T data) {
        if (head == null) return;

        if (head.getValue().equals(data)) {
            head = head.getNext();
            size--;
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null && 
               !current.getNext().getValue().equals(data)) {
            current = current.getNext();
        }

        if (current.getNext() != null) { // encontrado
            current.setNext(current.getNext().getNext());
            size--;
        }
    }

    public void printAllNodes() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
        System.out.println("-----");
    }

    public int size() {
        return size;
    }
}
