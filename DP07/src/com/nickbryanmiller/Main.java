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

//        Composite lc = new ArrayComposite( new Leaf<String>( "A" ), new Leaf<String>( "B" ) );
//        Composite ac = new ArrayComposite( new Leaf<String>( "C" ), lc, new Leaf<String>( "D" ) );
//        ac.objectToString();
//        ac.remove(lc);
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

        Composite ic = new InstanceComposite(new Leaf<String>("A"));
        Composite ic2 = new InstanceComposite(ic);
        Composite ac = new ArrayComposite( new Leaf( "C" ), ic2, new Leaf( "D" ) );
        Composite lc = new LinkedComposite( new Leaf( "A" ), ac, new Leaf( "B" ) );
        lc.objectToString();
    }
}
