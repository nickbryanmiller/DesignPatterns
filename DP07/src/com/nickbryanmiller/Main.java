package com.nickbryanmiller;

public class Main {

    public static void main(String[] args) {
//        Composite lc = new LinkedComposite();
//        lc.add(new Leaf<String>( "A" ), new Leaf<String>( "B" ));
//        //ac = new ArrayComposite( new Leaf( "C" ), lc, new Leaf( "D" ) );
//        //ac.toString();
//        Composite lc2 = new LinkedComposite();
//        lc2.add(new Leaf<String>( "C" ), lc, new Leaf<String>( "D" ) );
//        lc2.objectToString();

//        Composite lc = new LinkedComposite( new Leaf<String>( "A" ), new Leaf<String>( "B" ) );
//        Composite ac = new LinkedComposite( new Leaf<String>( "C" ), lc, new Leaf<String>( "D" ) );
//        ac.objectToString();
//        ac.remove(lc);
//        ac.objectToString();

//        Composite leaf = new Leaf<String>( "C" );
//        Composite leaf2 = new Leaf<String>( "D" );
//        Composite lc = new ArrayComposite( new Leaf<String>( "A" ), new Leaf<String>( "B" ) );
//        Composite ac = new ArrayComposite( leaf, lc, leaf2 );
//        ac.objectToString();
//        ac.remove(leaf2, lc);
//        ac.objectToString();

//        Composite lc = new LinkedComposite( new Leaf( "A" ), new Leaf( "B" ) );
//        Composite ac = new ArrayComposite( new Leaf( "C" ), lc, new Leaf( "D" ) );
//        ac.objectToString();

//        Composite ac = new ArrayComposite( new Leaf( "C" ), new Leaf( "D" ) );
//        Composite lc = new LinkedComposite( new Leaf( "A" ), ac, new Leaf( "B" ) );
//        lc.objectToString();

//        Composite ic = new InstanceComposite(new Leaf<String>("A"));
//        Composite ic2 = new InstanceComposite(ic);
//        ic2.objectToString();

//        Composite ic = new InstanceComposite(new Leaf<String>("A"));
//        Composite ic2 = new InstanceComposite(ic);
//        Composite ac = new ArrayComposite( new Leaf( "C" ), ic2, new Leaf( "D" ) );
//        Composite lc = new LinkedComposite( new Leaf( "A" ), ac, new Leaf( "B" ) );
//        lc.objectToString();

//        Composite leaf = new Leaf<String>( "C" );
//        Composite leaf2 = new Leaf<String>( "F" );
//        Composite lc = new StaticArrayComposite(2, new Leaf<String>( "A" ), new Leaf<String>( "B" ) );
//        Composite ac = new StaticArrayComposite( 4, leaf, lc, leaf2 );
//        ac.objectToString();
//        ac.remove(leaf2, lc);
//        ac.add(new Leaf<String>( "G" ));
//        ac.objectToString();

        Composite leaf1 = new Leaf<String>("A");
        Composite ic1 = new InstanceComposite(new Leaf<String>("B"));
        Composite lc1 = new LinkedComposite( new Leaf<String>( "C" ), ic1, new Leaf<String>( "D" ) );
        Composite ac1 = new ArrayComposite( new Leaf( "E" ), leaf1, new Leaf( "F" ) );
        Composite sac1 = new StaticArrayComposite( 3, new Leaf<String>("G"), new Leaf<String>("H") );
        Composite lc2 = new LinkedComposite( lc1, ac1, sac1);
        lc2.objectToString();
    }
}
