package com.nickbryanmiller;

public class Main {

    public static void main(String[] args) {

        // TESTS:

        /* // Test the linkedComposite and Leaf Class
        Composite lc = new LinkedComposite( new Leaf<String>( "A" ), new Leaf<String>( "B" ) );
        Composite ac = new LinkedComposite( new Leaf<String>( "C" ), lc, new Leaf<String>( "D" ) );
        ac.objectToString();
        ac.removeTM(lc);
        ac.objectToString();
        */

        /* // Test the ArrayComposite and Leaf Class
        Composite leaf = new Leaf<String>( "C" );
        Composite leaf2 = new Leaf<String>( "D" );
        Composite lc = new ArrayComposite( new Leaf<String>( "A" ), new Leaf<String>( "B" ) );
        Composite ac = new ArrayComposite( leaf, lc, leaf2 );
        ac.objectToString();
        ac.removeTM(leaf2, lc);
        ac.objectToString();
        */

        /* // Test that the ArrayComposite and LinkedComposite work together
        Composite lc = new LinkedComposite( new Leaf( "A" ), new Leaf( "B" ) );
        Composite ac = new ArrayComposite( new Leaf( "C" ), lc, new Leaf( "D" ) );
        ac.objectToString();
        */

        /* // Test that the ArrayComposite and LinkedComposite work together with the reverse
        Composite ac = new ArrayComposite( new Leaf( "C" ), new Leaf( "D" ) );
        Composite lc = new LinkedComposite( new Leaf( "A" ), ac, new Leaf( "B" ) );
        lc.objectToString();
        */

        /* // Test the InstanceComposite and Leaf Class
        Composite ic = new InstanceComposite(new Leaf<String>("A"));
        Composite ic2 = new InstanceComposite(ic);
        ic2.objectToString();
        */

        /* // Test that the ArrayComposite, LinkedComposite, and InstanceComposite work together
        Composite ic = new InstanceComposite(new Leaf<String>("A"));
        Composite ic2 = new InstanceComposite(ic);
        Composite ac = new ArrayComposite( new Leaf( "C" ), ic2, new Leaf( "D" ) );
        Composite lc = new LinkedComposite( new Leaf( "A" ), ac, new Leaf( "B" ) );
        lc.objectToString();
        */

        /* // Test that the ArrayComposite, StaticArrayComposite, LinkedComposite, and InstanceComposite work together
        Composite leaf = new Leaf<String>( "C" );
        Composite leaf2 = new Leaf<String>( "F" );
        Composite lc = new StaticArrayComposite(2, new Leaf<String>( "A" ), new Leaf<String>( "B" ) );
        Composite ac = new StaticArrayComposite( 4, leaf, lc, leaf2 );
        ac.objectToString();
        ac.removeTM(leaf2, lc);
        ac.addTM(new Leaf<String>( "G" ));
        ac.objectToString();
        */

        // Just a generic test with all of them working together
//        Composite leaf1 = new Leaf<String>("A");
//        Composite ic1 = new InstanceComposite(new Leaf<String>("B"));
//        Composite lc1 = new LinkedComposite( new Leaf<String>( "C" ), ic1, new Leaf<String>( "D" ) );
//        Composite ac1 = new ArrayComposite( new Leaf( "E" ), leaf1, new Leaf( "F" ) );
//        Composite sac1 = new StaticArrayComposite( 3, new Leaf<String>("G"), new Leaf<String>("H") );
//        Composite lc2 = new LinkedComposite( lc1, ac1, sac1);
//        // ac1.removeTM(leaf1); // to test you can remove anywhere
//        lc2.objectToString();

        // Test the new template methods
//        Composite leaf1 = new Leaf<String>( "A" );
//        Composite lc = new LinkedComposite();
//        lc.addTM(leaf1, new Leaf<String>( "B" ));
//        lc.objectToString();
//        System.out.println(lc);
//        System.out.println(leaf1);
//        System.out.println(leaf1.getParent());
//        lc.removeTM(leaf1);
//        lc.objectToString();
//        System.out.println(lc);
//        System.out.println(leaf1);
//        System.out.println(leaf1.getParent());

    }
}
