package edu.northeastern.zeyao;

import java.util.LinkedList;

public class LinkedListSynchronized {
    int value;
    public ListNode head;

    public LinkedListSynchronized() {
        head = null;
    }

    public LinkedList<Integer> list = new LinkedList<>();

    public void add(int i) {
        list.add(i);
    }

    public void addAtPosition(int index, int element) {
        list.add(index, element);
    }

    public void removeAtPosition(int index, int element) {
        list.remove(index);
    }

    public int getFirst() {
        int i = list.getFirst();
        return i;
    }

    public int getLast() {
        int i = list.getLast();
        return i;
    }

    public int size() {
        int size;
        size = list.size();
        return size;
    }

    public void printList() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();

    }
}