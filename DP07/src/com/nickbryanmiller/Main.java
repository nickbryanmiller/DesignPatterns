package com.nickbryanmiller;

public class Main {

    public static void main(String[] args) {
//        Composite boss = new LinkedComposite();
//        Composite manager1 = new LinkedComposite();
//        Composite manager2 = new LinkedComposite();
//        Composite worker1 = new Leaf<String>("nick1");
//        Composite worker2 = new Leaf<String>("miller1");
//        Composite workera = new Leaf<String>("nick2");
//        Composite workerb = new Leaf<String>("miller2");
//        boss.add(manager1);
//        boss.add(manager2);
//        manager1.add(worker1);
//        manager1.add(worker2);
//        manager2.add(workera);
//        manager2.add(workerb);
//        boss.objectToString();

//        Composite lc = new LinkedComposite();
//        lc.add(new Leaf<String>( "A" ), new Leaf<String>( "B" ));
//        //ac = new ArrayComposite( new Leaf( "C" ), lc, new Leaf( "D" ) );
//        //ac.toString();
//        Composite lc2 = new LinkedComposite();
//        lc2.add(new Leaf<String>( "C" ), lc, new Leaf<String>( "D" ) );
//        lc2.objectToString();

        Composite lc = new LinkedComposite( new Leaf<String>( "A" ), new Leaf<String>( "B" ) );
        Composite ac = new LinkedComposite( new Leaf<String>( "C" ), lc, new Leaf<String>( "D" ) );
        ac.objectToString();
    }
}
