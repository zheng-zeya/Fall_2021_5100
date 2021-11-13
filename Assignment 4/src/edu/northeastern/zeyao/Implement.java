package edu.northeastern.zeyao;

public class Implement implements Runnable{
    LinkedListSynchronized list;
    int value;

    public Implement(LinkedListSynchronized list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            System.out.println("Current thread name: " + Thread.currentThread().getName());
            for(int i = 0; i < 100; i++){
                list.add(value);
            }
            list.addAtPosition(4,1);
            System.out.println("Print out the list ");
            list.printList();
            list.removeAtPosition(0,1);
            list.printList();
            System.out.println(list.getFirst());
            System.out.println(list.size());
            System.out.println(Thread.currentThread().getName() + "  finished! ");
            System.out.println();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}