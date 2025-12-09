package controllers;

import models.Node;

public class Stack<T> {

    private Node<T> top;
    private int size;
    
    public Stack(){
        this.top = null;
        this.size = 0;
    }

    //Metodo para insertar
    public void push(T data){
    Node<T> newNode = new Node<T>(data);
    newNode.setNext(top);
    top = newNode;
    size++;
}

    //metodo para sacar y/o eliminar
    public T pop() {
        if(top == null){
            return null;
        }
        T data =  top.getValue();
        top = top.getNext();
        size--;
        return data;
        //throw new EmptySatckException(); -> bota el codigo en rojo
    }

    //retorna el primero pero sin eliminar
    public T peak(){
        if(top == null){
            return null;
            //throw new EmptySatckException();
        }
        // T data =  top.getValue();
        // return data;
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;
    }
    
    public int size(){
        // if(isEmpty()){
        //     return 0;
        // }

        // int count = 1;
        // Node<T> aux = top;
        // while(aux.getNext() != null){
        //     aux = aux.getNext();
        //     count++;
        // }
        // return count;
        return size;
    }

    public void printAllNodes(){
        Node<T> current = top;
        System.out.println("Cima -> ");
        while (current != null){
            System.out.println(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("FIN");
    }
}
