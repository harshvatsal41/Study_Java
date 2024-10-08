package com.start.LinkedList;

class LL{
    Node head;

    private int size;
    LL(){
        this.size=0;
    }



    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        while (current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("Our List is empty");
            return;
        }
        Node current = head;
        while (current != null){
            System.out.print(""+current.data+"-->  ");
            current = current.next;
        }
        System.out.println("Null");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("The List is Empty");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("The List Is Empty");
            return;
        }
        size--;
        if (head.next == null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize() {
        return size;
    }

    public void iterativeReverse(){
        if(head==null||head.next==null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode!=null){
            Node nexNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nexNode;

        }
        head.next = null;
        head = prevNode;
    }
    public Node reverseRecurse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newNode = reverseRecurse(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }
}
public class PolyFillOfLL {

    public static void main(String[] args) {
        LL list= new LL();
        list.addFirst("a");
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("Is");
        list.printList();
        System.out.println(list.getSize());
        list.addLast("Linked");
        list.printList();
        System.out.println(list.getSize());
        list.addLast("list");
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("This");
        list.printList();
        System.out.println(list.getSize());
        list.deleteFirst();
        list.printList();
        System.out.println(list.getSize());
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
//        list.iterativeReverse();
        list.head= list.reverseRecurse(list.head);
        list.printList();
    }
}
