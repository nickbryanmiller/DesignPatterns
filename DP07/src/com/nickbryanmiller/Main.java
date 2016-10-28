package com.nickbryanmiller;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // TESTS:

        // Test the new template methods
        /*
        Composite leaf1 = new Leaf<String>( "A" );
        Composite lc = new LinkedComposite();
        lc.addTM(leaf1, new Leaf<String>( "B" ));
        lc.objectToString();
        System.out.println(lc);
        System.out.println(leaf1);
        System.out.println(leaf1.getParent());
        lc.removeTM(leaf1);
        lc.objectToString();
        System.out.println(lc);
        System.out.println(leaf1);
        System.out.println(leaf1.getParent());
        */

        // Test the new iterator with just LinkedComposite and ArrayComposite
        /*
        Composite leaf1 = new Leaf<String>("A");
        Composite leaf2 = new Leaf<String>("B");
        Composite leaf3 = new Leaf<String>("C");
        Composite leaf4 = new Leaf<String>("D");
        Composite ac1 = new ArrayComposite( new Leaf( "E" ), new Leaf( "F" ), new Leaf( "G" ) );
        Composite lc1 = new LinkedComposite();
        lc1.addTM(leaf1, leaf2, leaf3, leaf4, ac1);
        System.out.println(lc1.objectToString());
        */

        // Test to make sure the InstanceComposite Adds a Child
        /*
        Composite leaf2 = new Leaf<String>("B");
        Composite ic1 = new InstanceComposite();
        System.out.println(leaf2);
        System.out.println(ic1);
        ic1.addTM(leaf2);
        System.out.println(leaf2.getParent());
        */

        // Test that we can reset the position of the iterator with the node position
        /*
        Composite leaf1 = new Leaf<String>( "A" );
        Composite leaf2 = new Leaf<String>( "B" );
        Composite leaf3 = new Leaf<String>( "C" );
        Composite leaf4 = new Leaf<String>( "D" );
        Composite lc1 = new LinkedComposite();
        lc1.addTM(leaf1, leaf2, leaf3, leaf4);
        */

        // Test Dave's way of working with the iterator
        /*
        MyIterator<Composite> it = lc1.makeIterator();
        for(it.first(); it.isValid(); it.next()) {
            Composite comp = it.getCurrent();
            System.out.println(comp.getValue());
        }
        */

        // Generic test case with all the concrete composites working together

//        Composite leaf1 = new Leaf<String>("A");
//        Composite ic1 = new InstanceComposite(new Leaf<String>("B"));
//        Composite lc1 = new LinkedComposite( new Leaf<String>( "C" ), ic1, new Leaf<String>( "D" ) );
//        Composite ac1 = new ArrayComposite( new Leaf( "E" ), leaf1, new Leaf( "F" ) );
//        Composite sac1 = new StaticArrayComposite( 3, new Leaf<String>("G"), new Leaf<String>("H"));
//        Composite lc2 = new LinkedComposite( lc1, sac1, ac1);
        // ac1.removeTM(leaf1); // to test you can remove anywhere
        /*
        System.out.println(lc2.objectToString());
        System.out.print("---------------------------------------------------\n\n");
        System.out.println(lc2.objectToStringReverse());
        */

//        MyIterator<Composite> it = lc2.makeIterator();
//        for(it.first(); it.isValid(); it.nextForPreorderGOF()) {
//            Composite comp = it.getCurrent();
//            System.out.println(comp.getValue());
//        }

    }
}
