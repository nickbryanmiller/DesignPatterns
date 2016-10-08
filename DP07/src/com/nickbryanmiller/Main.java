package com.nickbryanmiller;

public class Main {

    public static void main(String[] args) {
        Composite boss = new LinkedComposite();
        Composite manager1 = new LinkedComposite();
        Composite manager2 = new LinkedComposite();
        Composite worker1 = new Leaf<String>("nick1");
        Composite worker2 = new Leaf<String>("miller1");
        Composite workera = new Leaf<String>("nick2");
        Composite workerb = new Leaf<String>("miller2");

//        LinkedList<Composite> myList = new LinkedList<Composite>();
//        myList.addNode(worker1);
//        myList.addNode(worker2);
//        myList.addNode(workera);
//        myList.addNode(workerb);
//        myList.printList();
//        System.out.println("-------------");
//        myList.deleteWithValue(worker2);
//        myList.printList();

        boss.add(manager1);
        boss.add(manager2);
        manager1.add(worker1);
        manager1.add(worker2);
        manager2.add(workera);
        manager2.add(workerb);

        boss.objectToString();

    }
}
