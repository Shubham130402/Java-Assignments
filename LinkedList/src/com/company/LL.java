package com.company;

public class LL {
    private class Node{
        private Node head;
        private Node tail;
        private int size;
        public void LL(){
            this.size = 0 ;
        }

        public void insertatfirst(int value){
            // create a new node for the value
            Node node = new Node(value);
            node.next = head;
            head = node;

            if(tail==null){
                tail = head;
            }
            size+=1;
        }

        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.val + " ->");
                temp = temp.next;

            }
            System.out.println("END");
        }

        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

}



