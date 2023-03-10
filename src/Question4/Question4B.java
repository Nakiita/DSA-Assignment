package com.Coursework;

public class Question4B {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static int sort(Node head) {
        if (head == null) {
            return 0;
        }

        int steps = 0;
        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (prev.val > curr.val) {
                prev.next = curr.next;
                curr = prev.next;
                steps++;
                continue;
            }

            prev = curr;
            curr = curr.next;
        }

        return steps;
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println("Steps required to sort: " + sort(head));
    }
}